package com.kuaishou.webkit.adapter.SafeBrowsingResponseAdapter;
import com.kuaishou.webkit.SafeBrowsingResponse;
import android.webkit.SafeBrowsingResponse;

public class SafeBrowsingResponseAdapter extends SafeBrowsingResponse	// class@0012ac
{
    public SafeBrowsingResponse mStub;

    public void SafeBrowsingResponseAdapter(SafeBrowsingResponse p0){
       super();
       this.mStub = p0;
    }
    public void backToSafety(boolean p0){
       this.mStub.backToSafety(p0);
    }
    public void proceed(boolean p0){
       this.mStub.proceed(p0);
    }
    public void showInterstitial(boolean p0){
       this.mStub.showInterstitial(p0);
    }
}
