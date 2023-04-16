package com.kwai.library.widget.emptyview.KwaiEmptyStateInit;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import android.view.View$OnClickListener;

public final class KwaiEmptyStateInit extends Enum	// class@000933
{
    public View$OnClickListener mDarkNetworkResolveClickListener;
    public View$OnClickListener mLightNetworkResolveClickListener;
    public View$OnClickListener mNetworkResolveClickListener;
    public static final KwaiEmptyStateInit[] $VALUES;
    public static final KwaiEmptyStateInit INSTANCE;

    static {
       KwaiEmptyStateInit kwaiEmptySta = new KwaiEmptyStateInit("INSTANCE", 0);
       KwaiEmptyStateInit.INSTANCE = kwaiEmptySta;
       KwaiEmptyStateInit[] kwaiEmptySta1 = new KwaiEmptyStateInit[]{kwaiEmptySta};
       KwaiEmptyStateInit.$VALUES = kwaiEmptySta1;
    }
    public void KwaiEmptyStateInit(String p0,int p1){
       super(p0, p1);
    }
    public static KwaiEmptyStateInit valueOf(String p0){
       return Enum.valueOf(KwaiEmptyStateInit.class, p0);
    }
    public static KwaiEmptyStateInit[] values(){
       return KwaiEmptyStateInit.$VALUES.clone();
    }
    public View$OnClickListener getDarkNetworkResolveClickListener(){
       return this.mDarkNetworkResolveClickListener;
    }
    public View$OnClickListener getLightNetworkResolveClickListener(){
       return this.mLightNetworkResolveClickListener;
    }
    public View$OnClickListener getNetworkResolveClickListener(){
       return this.mNetworkResolveClickListener;
    }
    public void setDarkNetworkResolveClickListener(View$OnClickListener p0){
       this.mDarkNetworkResolveClickListener = p0;
    }
    public void setLightNetworkResolveClickListener(View$OnClickListener p0){
       this.mLightNetworkResolveClickListener = p0;
    }
    public void setNetworkResolveClickListener(View$OnClickListener p0){
       this.mNetworkResolveClickListener = p0;
    }
}
