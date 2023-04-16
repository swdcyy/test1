package com.kwai.live.gzone.tab.bean.LiveGzoneTab;
import com.kwai.live.gzone.tab.bean.LiveGzoneTab$TabType;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
import com.yxcorp.utility.TextUtils;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.live.gzone.tab.bean.LiveGzoneTabServerInfo;
import java.util.List;
import java.lang.CharSequence;
import android.text.TextUtils;
import lnc.a1;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Enum;

public final class LiveGzoneTab	// class@000e07
{
    public final String a;
    public final LiveGzoneTab$TabType b;
    public LiveGzoneTabServerInfo c;
    public final List d;
    public LiveGzoneTab e;
    public boolean f;

    public void LiveGzoneTab(LiveGzoneTab$TabType p0,String p1){
       super();
       this.d = new ArrayList();
       this.a = TextUtils.i(p1, String.valueOf(p0.mTypeValue));
       this.b = p0;
       this.f = p0.mIsDefaultVisible;
    }
    public static LiveGzoneTab a(){
       Object obj = PatchProxy.apply(null, null, LiveGzoneTab.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       LiveGzoneTab$TabType cHAT = LiveGzoneTab$TabType.CHAT;
       return new LiveGzoneTab(cHAT, cHAT.mTypeValue);
    }
    public LiveGzoneTabServerInfo b(){
       return this.c;
    }
    public List c(){
       return this.d;
    }
    public String d(){
       LiveGzoneTab obj = PatchProxy.apply(null, this, LiveGzoneTab.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj != null && !TextUtils.isEmpty(obj.mName)) {
          return this.c.mName;
       }
       return a1.p(this.b.mDefaultTabNameRes);
    }
    public String e(){
       LiveGzoneTab obj = PatchProxy.apply(null, this, LiveGzoneTab.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj != null && !TextUtils.isEmpty(obj.mTabId)) {
          return this.c.mTabId;
       }
       return this.a;
    }
    public boolean equals(Object p0){
       LiveGzoneTab liveGzoneTab = LiveGzoneTab.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, liveGzoneTab, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0) {
          return true;
       }
       boolean b = false;
       if (p0 == null || liveGzoneTab != p0.getClass()) {
          return b;
       }
       if (this.b != p0.b) {
          return b;
       }
       if (!TextUtils.equals(this.e(), p0.e())) {
          return b;
       }
       if (this.b == LiveGzoneTab$TabType.H5 && (this.b() != null && p0.b() != null)) {
          return TextUtils.equals(this.b().mLink, p0.b().mLink);
       }
       return true;
    }
    public LiveGzoneTab$TabType f(){
       return this.b;
    }
    public void g(LiveGzoneTabServerInfo p0){
       this.c = p0;
    }
    public int hashCode(){
       LiveGzoneTab obj = PatchProxy.apply(null, this, LiveGzoneTab.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveGzoneTab tb = this.b;
       int i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.c;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.d;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.e;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (((i1 + i) * 31) + this.f);
    }
    public String toString(){
       return this.a;
    }
}
