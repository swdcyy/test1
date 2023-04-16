package aw3.c$a;
import fq5.b;
import aw3.c;
import java.lang.Object;
import aq5.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import xp5.g;
import java.lang.Integer;
import com.kwai.framework.model.user.User;
import fq5.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import or5.b;
import ks3.b;
import lp3.e;
import hf3.a;
import v51.a;
import com.kwai.feature.api.live.base.service.scenetype.LiveSceneType;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.feature.api.live.base.service.model.LiveStreamClickType;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import android.os.Bundle;

public final class c$a implements b	// class@0002d1
{
    public final c a;
    public final boolean b;

    public void c$a(c p0,boolean p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public d A0(){
       return null;
    }
    public int B0(){
       c$a uoa = c$a.class;
       Object[] objArray = null;
       c obj = PatchProxy.applyWithListener(objArray, this, uoa, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a.b;
       if (obj != null) {
          objArray = Integer.valueOf(obj.V0());
       }
       PatchProxy.onMethodExit(uoa, "5");
       return objArray.intValue();
    }
    public User I(){
       Object[] objArray = null;
       c obj = PatchProxy.applyWithListener(objArray, this, c$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.b;
       if (obj != null) {
          objArray = obj.I();
       }
       PatchProxy.onMethodExit(c$a.class, "3");
       return objArray;
    }
    public boolean U(){
       return a.b(this);
    }
    public ClientContent$LiveStreamPackage a(){
       Object[] objArray = null;
       c obj = PatchProxy.applyWithListener(objArray, this, c$a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.d;
       if (obj != null) {
          objArray = obj.a();
       }
       PatchProxy.onMethodExit(c$a.class, "6");
       return objArray;
    }
    public BaseFragment b(){
       return null;
    }
    public String d(){
       String str;
       c obj = PatchProxy.applyWithListener(null, this, c$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.b;
       if (obj != null) {
          str = obj.d();
          if (str != null) {
          label_001f :
             PatchProxy.onMethodExit(c$a.class, "2");
             return str;
          }
       }
       str = "";
       goto label_001f ;
    }
    public boolean e(){
       return false;
    }
    public String getLiveStreamId(){
       String liveStreamId;
       c obj = PatchProxy.applyWithListener(null, this, c$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.b;
       if (obj != null) {
          liveStreamId = obj.getLiveStreamId();
          if (liveStreamId != null) {
          label_001f :
             PatchProxy.onMethodExit(c$a.class, "1");
             return liveStreamId;
          }
       }
       liveStreamId = "";
       goto label_001f ;
    }
    public boolean l(){
       return a.a(this);
    }
    public LiveStreamFeedWrapper r5(){
       Object[] objArray = null;
       c obj = PatchProxy.applyWithListener(objArray, this, c$a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.b;
       if (obj != null) {
          objArray = obj.r5();
       }
       PatchProxy.onMethodExit(c$a.class, "9");
       return objArray;
    }
    public long s(){
       return 0;
    }
    public String s5(){
       Object[] objArray = null;
       c obj = PatchProxy.applyWithListener(objArray, this, c$a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.e;
       if (obj != null) {
          objArray = obj.a();
       }
       PatchProxy.onMethodExit(c$a.class, "8");
       return objArray;
    }
    public e t5(){
       return null;
    }
    public a u(){
       Object[] objArray = null;
       c obj = PatchProxy.applyWithListener(objArray, this, c$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.c;
       if (obj != null) {
          objArray = obj.u();
       }
       PatchProxy.onMethodExit(c$a.class, "4");
       return objArray;
    }
    public LiveSceneType u5(){
       return LiveSceneType.Audience;
    }
    public void w0(UserProfile p0,LiveStreamClickType p1,int p2,boolean p3,int p4){
    }
    public ClientContent$LiveVoicePartyPackageV2 y(){
       return null;
    }
    public Bundle z0(){
       Object obj = PatchProxy.applyWithListener(null, this, c$a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(c$a.class, "7");
       return new Bundle();
    }
}
