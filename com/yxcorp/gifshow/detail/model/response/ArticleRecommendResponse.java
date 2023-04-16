package com.yxcorp.gifshow.detail.model.response.ArticleRecommendResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;

public class ArticleRecommendResponse implements Serializable	// class@0015b5
{
    public String mLlsid;
    public List mRecommendArticles;
    public static final long serialVersionUID = 0xc987b6f23af4279a;

    public void ArticleRecommendResponse(){
       super();
    }
    public String getLlsid(){
       return this.mLlsid;
    }
}
