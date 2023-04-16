package com.kwai.live.gzone.accompanyplay.edit.m;
import java.lang.Object;
import lnc.a1;
import mrd.a;
import io.reactivex.subjects.PublishSubject;
import crd.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import n37.k;
import fq5.b;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.CharSequence;
import android.text.TextUtils;
import j37.b;
import j37.a;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyGameInfo;
import brd.t;
import j37.d;
import j37.c;
import cjd.e;
import erd.o;
import com.kwai.live.gzone.accompanyplay.edit.m$b;
import sfc.a;
import erd.g;
import com.kwai.live.gzone.accompanyplay.edit.m$a;

public class m	// class@000c0b
{
    public boolean a;
    public String b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public String i;
    public int j;
    public t k;
    public a l;
    public PublishSubject m;
    public String n;
    public b o;
    public a p;
    public b q;
    public String r;
    public String s;
    public String t;
    public boolean u;
    public boolean v;
    public String w;

    public void m(){
       super();
       this.j = a1.e(397.00f);
       this.l = a.g();
       this.m = PublishSubject.g();
    }
    public b a(){
       Object[] objArray = null;
       k obj = PatchProxy.apply(objArray, this, m.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.l.i();
       if (obj == null) {
          return objArray;
       }
       t ot = (TextUtils.equals(this.o.d(), QCurrentUser.ME.getId()))? a.b().a(obj.b.mGameId): c.b().a(obj.b.mGameId);
       return ot.map(new e()).subscribe(new m$b(this), new a());
    }
    public void b(t p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "1")) {
          return;
       }
       if (p0 instanceof a) {
          this.l = p0;
          return;
       }else {
          p0.doOnNext(new m$a(this)).subscribe();
          return;
       }
    }
}
