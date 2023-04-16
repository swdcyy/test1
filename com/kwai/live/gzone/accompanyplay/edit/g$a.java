package com.kwai.live.gzone.accompanyplay.edit.g$a;
import erd.o;
import com.kwai.live.gzone.accompanyplay.edit.g;
import java.lang.String;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyFleetSetting;
import java.lang.Object;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyCurrentAccompanyInfo;
import brd.w;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import j37.b;
import j37.a;
import brd.t;
import cjd.e;
import com.kwai.live.gzone.accompanyplay.edit.g$a$a;

public class g$a implements o	// class@000be6
{
    public final String b;
    public final LiveGzoneAccompanyFleetSetting c;
    public final g d;

    public void g$a(g p0,String p1,LiveGzoneAccompanyFleetSetting p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public w a(LiveGzoneAccompanyCurrentAccompanyInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.x(p0.mAccompanyId) && !(p0.mAccompanyId).equals("0")) {
          return a.b().l(p0.mAccompanyId, this.b).map(new e()).flatMap(new g$a$a(this, p0));
       }
       return a.b().h(this.b, this.c.mFleetId).map(new e());
    }
    public Object apply(Object p0){
       return this.a(p0);
    }
}
