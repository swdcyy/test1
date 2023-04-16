package com.kuaishou.post.story.activity.StoryAlbumActivity$a;
import w69.k0;
import com.kuaishou.post.story.activity.StoryAlbumActivity;
import java.lang.Object;
import w69.j0;
import java.util.List;
import java.lang.String;
import jlb.b;
import android.app.Activity;
import brd.t;
import dc7.e;
import dc7.d;
import com.yxcorp.gifshow.models.QMedia;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import sp4.d;
import java.lang.Integer;
import rp4.a;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import qr4.m$n;
import com.yxcorp.utility.TextUtils;
import qr4.m$e$a;
import qr4.m$w;
import java.io.File;
import com.yxcorp.gifshow.media.util.c;
import java.lang.CharSequence;
import com.kwai.framework.model.user.QCurrentUser;
import s16.j;
import qr4.i;
import qr4.m$k0;
import com.kwai.robust.PatchProxyResult;
import brd.m;
import io.reactivex.internal.operators.maybe.b;
import ird.a;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;
import sp4.c;
import java.util.concurrent.Callable;
import java.util.Objects;
import erd.r;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.operators.maybe.l;
import brd.q;
import t45.d;
import brd.z;
import t90.q;
import erd.a;
import sp4.a;
import sp4.b;
import com.kuaishou.post.story.activity.a;
import erd.g;
import crd.b;

public class StoryAlbumActivity$a implements k0	// class@000aa0
{
    public final StoryAlbumActivity a;

    public void StoryAlbumActivity$a(StoryAlbumActivity p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       return j0.c(this);
    }
    public void b(List p0,boolean p1,String p2,String p3,String p4){
       j0.d(this, p0, p1, p2, p3, p4);
    }
    public void c(){
       j0.g(this);
    }
    public void d(boolean p0){
       j0.h(this, p0);
    }
    public void e(b p0){
       j0.a(this, p0);
    }
    public void f(List p0,Activity p1){
       j0.j(this, p0, p1);
    }
    public void g(boolean p0){
       j0.b(this, p0);
    }
    public void h(t p0){
       d.a(this, p0);
    }
    public void i(QMedia p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, StoryAlbumActivity$a.class, "1")) {
          return;
       }
       StoryAlbumActivity$a ta = this.a;
       StoryAlbumActivity o = ta.O;
       if (!PatchProxy.isSupport(d.class) || !PatchProxy.applyVoidFourRefs(ta, Integer.valueOf(o), p0, p1, null, d.class, "1")) {
          int i = 0;
          Object[] objArray = new Object[i];
          a.D().s("StoryAlbumUtil", "onPickResult: media type:"+p0.type+",duration:"+p0.duration, objArray);
          VideoContext videoContext = new VideoContext();
          boolean b = true;
          videoContext.b1(b);
          videoContext.U1(p1);
          m$n on = new m$n();
          on.b = p0.duration;
          on.k = p0.created;
          on.g = p0.path;
          on.h = TextUtils.k(p0.mAlbum);
          if (p0.type == null) {
             on.a = 2;
             on.f = new m$e$a();
          }else {
             on.a = b;
             m$w ow = new m$w();
             on.d = ow;
             ow.c = p0.duration;
             ow.d = new File(p0.path).length();
             String str = c.j(p0.path);
             on.c = str;
             if (TextUtils.x(str)) {
                on.c = j.a(QCurrentUser.me().getId());
             }
          }
          m$n[] onArray = new m$n[b];
          onArray[i] = on;
          videoContext.F().b.E = onArray;
          m om = PatchProxy.applyTwoRefs(ta, p0, null, d.class, "2");
          if (om != PatchProxyResult.class) {
          }else if(p0.type != null){
             om = a.g(b.b);
          }else {
             ProgressFragment progressFrag = new ProgressFragment();
             progressFrag.setCancelable(i);
             progressFrag.show(ta.getSupportFragmentManager(), "Exif");
             m om1 = m.r(new c(p0));
             Objects.requireNonNull(om1);
             r or = Functions.a();
             a.c(or, "predicate is null");
             om = a.g(new l(om1, or)).B(d.c).u(d.a).g(new q(progressFrag));
          }
          om.g(new a(ta, o, p0, videoContext)).y(new b(on), a.b);
       }
       return;
    }
    public void j(){
       j0.e(this);
    }
    public void k(){
       d.b(this);
    }
    public void l(boolean p0,boolean p1){
       j0.i(this, p0, p1);
    }
    public void m(boolean p0){
       j0.k(this, p0);
    }
}
