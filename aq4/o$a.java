package aq4.o$a;
import com.yxcorp.gifshow.widget.m;
import aq4.o;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import cq4.n;
import fq4.a;
import com.kuaishou.post.story.entrance.e;
import java.lang.Integer;
import rp4.b;
import rp4.c;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import aq4.m;
import android.widget.AbsoluteLayout;
import java.lang.Boolean;
import qtc.b;
import com.yxcorp.gifshow.v3.editor.sticker.resource.EditStickerRepo;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import qtc.a;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.MutableLiveData;
import cq4.g;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import java.util.Set;
import com.yxcorp.gifshow.v3.editor.sticker.h1;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.StickerLibraryFragment;
import com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.StickerLibraryFragment$c;
import cq4.h;
import java.util.List;
import mrd.a;
import com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.StickerLibraryFragment$d;
import java.lang.StringBuilder;
import java.lang.System;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;
import im8.f;
import io.reactivex.subjects.PublishSubject;
import com.kuaishou.post.story.widget.StoryDecorationContainerView;

public class o$a extends m	// class@0002d0
{
    public final o c;

    public void o$a(o p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       Object obj = this;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, obj, o$a.class, str)) {
          return;
       }
       o$a c = obj.c;
       Objects.requireNonNull(c);
       n on = n.class;
       o oo = o.class;
       if (!PatchProxy.applyVoid(null, c, oo, "10")) {
          String str1 = "click_sticker";
          int i = 2;
          if (c.s.t.c.intValue() == i) {
             b.h("RECORD_VIDEO_EDIT_OPERATION", str1, "EDIT_MOOD_PHOTO", "");
          }else {
             c.b(404, str1);
          }
          if (c.getActivity() != null) {
             m om = new m(c);
             o y = c.y;
             o v = c.v;
             o a = c.A;
             int i1 = c.s.t.c.intValue();
             o z = c.z;
             int width = c.q.getWidth();
             Objects.requireNonNull(y);
             if (PatchProxy.isSupport(on)) {
                Object[] objArray = new Object[]{v,om,a,Integer.valueOf(i1),Boolean.valueOf(z),Integer.valueOf(width)};
                if (PatchProxy.applyVoid(objArray, y, on, str)) {
                label_00d0 :
                   h1.o();
                   o y1 = c.y;
                   Objects.requireNonNull(y1);
                   on = PatchProxy.apply(null, y1, on, "2");
                   if (on != PatchProxyResult.class) {
                   }else {
                      StickerLibraryFragment stickerLibra = new StickerLibraryFragment();
                      y1.a = stickerLibra;
                      StickerLibraryFragment$c uoc = new StickerLibraryFragment$c(y1.c, y1.d, y1.h, new h(y1));
                      uoc.b(y1.g);
                      stickerLibra.Th(uoc);
                      y1.b();
                      y1.j = true;
                      on = y1.a;
                   }
                   str = "sticker"+System.currentTimeMillis();
                   if (!PatchProxy.applyVoidTwoRefs(on, str, c, oo, "11")) {
                      GifshowActivity activity = c.getActivity();
                      if (activity != null) {
                         e uoe = activity.getSupportFragmentManager().beginTransaction();
                         uoe.z(R.anim.arg_RES_7f01011f, 0, 0, R.anim.arg_RES_7f010123);
                         uoe.g(R.id.editor_container, on, str);
                         uoe.j(str);
                         uoe.m();
                         c.t.set(Boolean.TRUE);
                         c.u.set("sticker");
                         c.r.onNext(Integer.valueOf(1));
                      }
                   }
                   c.q.R();
                }
             }
             if (y.k == null) {
                a uoa = ViewModelProviders.of(v, new b(new EditStickerRepo())).get(a.class);
                y.k = uoa;
                uoa.s0().observe(v, new g(y));
             }
             y.k.o0();
             y.d.add(om);
             y.i = a;
             y.b = i1;
             y.g = z;
             y.l = width;
             goto label_00d0 ;
          }
       }
       return;
    }
}
