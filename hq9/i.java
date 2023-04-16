package hq9.i;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import com.yxcorp.gifshow.activity.GifshowActivity;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import org.greenrobot.eventbus.a;
import cda.c;
import wnc.a;
import e17.i;
import com.kuaishou.android.model.mix.PhotoMeta;
import tl8.d;
import cz5.a;
import hq9.c;
import erd.g;
import cjd.e;
import erd.o;
import hq9.d;
import hq9.h;
import hq9.f;
import xy5.h;
import wkd.b;
import bf6.h;
import hq9.b;
import hq9.e;
import hq9.g;
import com.google.gson.JsonElement;
import java.lang.Throwable;
import android.app.Activity;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;
import wh5.c;
import vca.i;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.smile.gifmaker.mvps.utils.DefaultSyncable;

public class i	// class@00270a
{
    public final QPhoto a;
    public JsonElement b;

    public void i(QPhoto p0){
       super();
       this.a = p0;
    }
    public t a(GifshowActivity p0){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i oi = i.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, oi, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       i = 0x7f1038e7;
       int i1 = 0x7f110668;
       t ot = null;
       if (this.a.isCollected()) {
          a.d().k(new c(this.a, 2));
          obj = PatchProxy.applyOneRefs(p0, this, oi, "3");
          if (obj != patchProxyRe) {
             ot = obj;
          }else if(!a.a()){
             i.a(i1, i);
          }else if(this.a.mEntity.a(PhotoMeta.class) == null){
             t ot1 = PatchProxy.apply(ot, this, oi, "6");
             if (ot1 != patchProxyRe) {
             }else {
                ot1 = a.c(this.a.getPhotoId(), this.a.getExpTag(), this.a.getUserId(), this.a.getFeedLogCtxString()).doOnNext(new c(this)).map(new e()).doOnNext(new d(this));
             }
             ot = ot1.doOnNext(h.b).doOnError(new f(this, p0)).map(h.b);
          }
          return ot;
       }else {
          a.d().k(new c(this.a, 1, 1));
          b.a(0x3adc2a3f).e(3);
          Object obj1 = PatchProxy.applyOneRefs(p0, this, oi, "5");
          if (obj1 != patchProxyRe) {
             ot = obj1;
          }else if(!a.a()){
             i.a(i1, i);
          }else {
             PhotoMeta photoMeta = this.a.mEntity.a(PhotoMeta.class);
             if (photoMeta != null) {
                ot = a.a(this.a.getPhotoId(), this.a.getExpTag(), this.a.getUserId(), this.a.getFeedLogCtxString()).doOnNext(new b(this)).map(new e()).doOnNext(new e(this, photoMeta)).doOnError(new g(this, p0)).map(h.b);
             }
          }
          return ot;
       }
    }
    public JsonElement b(){
       return this.b;
    }
    public final String c(Throwable p0,Activity p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, i.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = (TextUtils.x(p0.getMessage()))? p1.getString(R.string.arg_RES_7f100736): p0.getMessage();
       if (str.contains("ERR_TIMED_OUT")) {
          str = p1.getString(R.string.arg_RES_7f100736);
       }
       return str;
    }
    public boolean d(){
       Object obj = PatchProxy.apply(null, this, i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.a != null && (!c.b() && (!i.d(this.a) && this.a.isPublic())))? true: false;
       return b;
    }
    public final void e(PhotoMeta p0,boolean p1){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, oi, "7")) {
          return;
       }
       p0.mCollected = p1;
       p0.notifyChanged();
       p0.fireSync();
       return;
    }
}
