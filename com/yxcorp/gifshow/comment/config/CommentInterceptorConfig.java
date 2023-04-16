package com.yxcorp.gifshow.comment.config.CommentInterceptorConfig;
import java.io.Serializable;
import java.lang.Object;
import com.yxcorp.gifshow.comment.config.CommentInterceptorConfig$MultipleLanguage;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ra6.a;
import com.yxcorp.utility.TextUtils;

public class CommentInterceptorConfig implements Serializable	// class@0010aa
{
    public CommentInterceptorConfig$AlertInfo mAlertInfo;
    public int mAlertType;
    public int mButtonTextType;
    public String mEncodeMatcher;
    public int mItemId;
    public boolean mNeedFilter;
    public String mPreExcludeMatcher;
    public static final long serialVersionUID = 0x3b628eac9537b85d;

    public void CommentInterceptorConfig(){
       super();
    }
    public static String getSuitMultiLanguageText(CommentInterceptorConfig$MultipleLanguage p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CommentInterceptorConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = a.d();
       if (i == 2) {
          return TextUtils.i(p0.mTraditionalChinese, "");
       }
       if (i != 3) {
          return p0.mSimpleChinese;
       }
       return TextUtils.i(p0.mEnglishText, "");
    }
}
