package com.kwai.feature.post.api.feature.bridge.JsGetEditDraftDataResult$a;
import java.lang.String;
import java.lang.Object;
import java.lang.CharSequence;
import android.text.format.DateFormat;

public final class JsGetEditDraftDataResult$a	// class@00133b
{
    public String mCoverPath;
    public String mIdentifier;
    public long mLastModified;
    public String mSubTitle;

    public void JsGetEditDraftDataResult$a(String p0,long p1,String p2){
       super();
       this.mCoverPath = p0;
       this.mLastModified = p1 / 1000;
       this.mSubTitle = DateFormat.format("yyyy.MM.dd", p1).toString();
       this.mIdentifier = p2;
    }
}
