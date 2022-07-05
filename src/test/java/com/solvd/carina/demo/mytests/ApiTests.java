package com.solvd.carina.demo.mytests;

import com.qaprosoft.apitools.validation.JsonCompareKeywords;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.solvd.carina.demo.api.*;
import com.solvd.carina.demo.api.example.DeleteUserMethod;
import com.solvd.carina.demo.api.example.PostUserMethod;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import java.lang.invoke.MethodHandles;
import java.net.http.HttpHeaders;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ApiTests implements IAbstractTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

//    @Test
//    @MethodOwner(owner = "Dmitry")
//    public void testPost() {
//        PostUserMethod api = new PostUserMethod();
//        api.callAPI();
//    }
    @Test
    @MethodOwner(owner = "kalinin_valentine")
    public void deleteUser(){
        DeleteUserMethod api = new DeleteUserMethod();
        api.callAPI();
    }


    @Test
    @MethodOwner(owner = "kalinin_valentine")
    public void postUser(){
        PostUserMethod api = new PostUserMethod();
        api.removeProperty("user");
        api.callAPI();
    }

    @Test
    @MethodOwner(owner = "kalinin_valentine")
    public void deleteUserExpected200() {
        DeleteUserMethod api = new DeleteUserMethod();
        api.expectResponseStatus(HttpResponseStatusType.OK_200);
        api.callAPI();
    }

    @Test
    @MethodOwner(owner = "kalinin_valentine")
    public void testDelete() {
        DeletePostMethod deletePostMethod = new DeletePostMethod();
        deletePostMethod.callAPI();
        deletePostMethod.validateResponse();
    }

    @Test
    @MethodOwner(owner = "kalinin_valentine")
    public void testPatch() {
        PatchPostMethod patchPostMethod = new PatchPostMethod();
        patchPostMethod.callAPI();
    }

    @Test
    @MethodOwner(owner = "kalinin_valentine")
    public void testPut() {
        PutPostMethod putPostMethod = new PutPostMethod();
        putPostMethod.callAPI();
    }

    @Test
    @MethodOwner(owner = "kalinin_valentine")
    public void testPost() {
        PostPostMethod postPostMethod = new PostPostMethod();
        postPostMethod.setProperties("api/posts/post.properties");
        postPostMethod.callAPI();
        postPostMethod.validateResponse();

    }

    @Test
    @MethodOwner(owner = "kalinin_valentine")
    public void testGet() {
        GetPostMethod getPostMethod = new GetPostMethod();
        getPostMethod.callAPI();
        getPostMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getPostMethod.validateResponseAgainstSchema("api/posts/get/_get/rs.schema");
    }

    @Test
    @MethodOwner(owner = "kalinin_valentine")
    public void testGetOne() {
        GetPostOneMethod getPostOneMethod = new GetPostOneMethod();
        getPostOneMethod.callAPI();
        getPostOneMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getPostOneMethod.validateResponseAgainstSchema("api/posts/get/_get_post_one/rs.schema");
    }

    @Test
    @MethodOwner(owner = "kalinin_valentine")
    public void testGetPostComment() {
        GetPostComments getPostComments = new GetPostComments();
        getPostComments.callAPI();
        getPostComments.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getPostComments.validateResponseAgainstSchema("api/posts/get/get_post_comments/rs.schema");
    }

    @Test
    @MethodOwner(owner = "kalinin_valentine")
    public void testGetPostCommentsById(){
        GetPostCommentsById getPostCommentsById = new GetPostCommentsById();
        getPostCommentsById.callAPI();
        getPostCommentsById.validateResponse(JSONCompareMode.STRICT,JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getPostCommentsById.validateResponseAgainstSchema("api/posts/get/_get_post_comments_by_id/rs.schema");
    }

    @Test
    @MethodOwner(owner = "kalinin_valentine")
    public void testOptionsPost(){
        OptionsPostMethod optionsPostMethod = new OptionsPostMethod();
        optionsPostMethod.callAPI();
    }

    @Test
    @MethodOwner(owner = "kalinin_valentine")
    public void testHeadPost(){
        HeadPostMethod headPostMethod = new HeadPostMethod();
        headPostMethod.callAPI();
    }
}
