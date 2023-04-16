package com.yxcorp.gifshow.camera.record.magic.l$a;
import uyb.c$a;
import com.yxcorp.gifshow.camera.record.magic.l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import s5b.b;
import q87.c;
import m4b.c;
import com.yxcorp.gifshow.model.WishMagicInfo;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.MagicEmoji$SeekBarType;
import java.lang.Float;
import java.lang.Boolean;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Map;
import java.util.HashMap;

public class l$a implements c$a	// class@000e45
{
    public final l a;

    public void l$a(l p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, l$a.class, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.D().w("MagicHandler", "onMultiInputTextRequest", objArray);
       this.a.p.j0().a();
       return;
    }
    public WishMagicInfo b(){
       Object obj = PatchProxy.apply(null, this, l$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.p.j0().b();
    }
    public void c(float p0,MagicEmoji$SeekBarType p1,boolean p2){
       if (PatchProxy.isSupport(l$a.class) && PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), p1, Boolean.valueOf(p2), this, l$a.class, "1")) {
          return;
       }
       MagicEmoji$MagicFace magicFace = this.a.i();
       if (magicFace != null && !TextUtils.x(magicFace.mId)) {
          Map map = this.a.t.get(magicFace.mId);
          if (map == null) {
             map = new HashMap();
             this.a.t.put(magicFace.mId, map);
          }
          map.put(p1, Float.valueOf(p0));
       }
       this.a.p.j0().c(p0, p1, p2);
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, l$a.class, "2")) {
          return;
       }
       this.a.p.j0().d();
       return;
    }
    public void e(WishMagicInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l$a.class, "3")) {
          return;
       }
       this.a.p.j0().e(p0);
       return;
    }
}
