package cl5.e;
import al5.a;
import java.util.ArrayList;
import pl8.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yk5.e;
import java.util.List;
import java.util.Collection;
import yk5.f;
import com.kwai.emotionsdk.panel.EmotionPanelConfig;
import java.util.Iterator;
import com.kwai.emotionsdk.bean.EmotionInfo;
import ql8.a;
import yk5.c;
import lnc.a1;
import yk5.d;
import yk5.g;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import io.reactivex.subjects.PublishSubject;
import com.kwai.emotionsdk.widget.EmotionLongClickRecyclerView;
import cl5.a;
import erd.g;
import crd.b;
import brd.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import uk5.r;
import cl5.e$a;
import vk5.a;
import pl8.a;
import sl8.b;
import androidx.recyclerview.widget.GridLayoutManager;
import android.content.Context;
import cl5.e$b;
import androidx.recyclerview.widget.GridLayoutManager$b;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import cl5.e$c;
import androidx.recyclerview.widget.RecyclerView$n;
import ekd.q;
import dl5.b;
import androidx.recyclerview.widget.h$b;
import androidx.recyclerview.widget.h$e;
import androidx.recyclerview.widget.h;
import android.view.View;
import jl5.w;
import xk5.c;
import java.lang.Integer;

public class e extends a	// class@0006f1
{
    public d A;
    public f p;
    public EmotionPanelConfig q;
    public c r;
    public int s;
    public EmotionLongClickRecyclerView t;
    public a u;
    public GridLayoutManager v;
    public final List w;
    public final List x;
    public int y;
    public e$c z;

    public void e(){
       super();
       this.w = new ArrayList();
       this.x = new ArrayList();
       this.A = new d();
    }
    public void E8(){
       int i2;
       EmotionInfo uEmotionInfo;
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "3")) {
          return;
       }
       if (!this.p instanceof e) {
          return;
       }
       e uoe1 = 4;
       int i = 0;
       if (!PatchProxy.applyVoid(objArray, this, uoe, "5")) {
          this.w.clear();
          this.w.addAll(this.p.f());
          if (this.p.d() == 2 && !this.q.isShowDice()) {
             Iterator iterator1 = this.w.iterator();
             while (true) {
                if (iterator1.hasNext()) {
                   uEmotionInfo = iterator1.next();
                   if (uEmotionInfo != null && uEmotionInfo.mBizType == uoe1) {
                      this.w.remove(uEmotionInfo);
                   }
                }
             }
          }
          i2 = this.w.size();
          i2 = i2 - 1;
          while (i2 >= 0) {
             uEmotionInfo = this.w.get(i2);
             if (uEmotionInfo == null || uEmotionInfo.mHidePanel != null) {
                this.w.remove(uEmotionInfo);
             }else {
                continue ;
             }
          }
          for (i2 = 0; i2 < this.w.size(); i2 = i2 + 1) {
             this.w.get(i2).mIndex = i2;
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, uoe, "6")) {
          this.x.clear();
          int i1 = 1000;
          i2 = 1;
          if (this.p.d() == 2) {
             this.x.add(i, new a(new c(a1.p(R.string.arg_RES_7f100d86)), i1));
             if (this.q.isShowAdd()) {
                this.x.add(i2, new a(new d(), 101));
             }
          }else if(this.p.d() == uoe1){
             this.x.add(i, new a(new c(a1.p(R.string.arg_RES_7f100d88)), i1));
             if (this.q.isEnableGIFSearch()) {
                this.x.add(i2, new a(new g(), 301));
             }
          }else {
             String str = this.p.e();
             if (!TextUtils.x(str)) {
                this.x.add(i, new a(new c(str), i1));
             }
          }
          int i3 = this.p.d();
          i1 = 200;
          if (i3 == 2) {
             i1 = 100;
          }else if(i3 == 3){
             if (i3 == uoe1) {
                i1 = 300;
             }else if(i3 == 5){
                i1 = 400;
             }
          }
          Iterator iterator = this.w.iterator();
          while (iterator.hasNext()) {
             this.x.add(new a(iterator.next(), i1));
          }
       }
       if (this.t.getConfigSubject() != null) {
          this.X7(this.t.getConfigSubject().subscribe(new a(this)));
       }
       if (this.u == null) {
          this.y = r.a(this.s);
          this.A.a(this.x);
          this.u = new a(this.A, new e$a(this));
          GridLayoutManager gridLayoutMa = new GridLayoutManager(this.getContext(), this.y);
          this.v = gridLayoutMa;
          gridLayoutMa.m1(new e$b(this));
          this.t.setLayoutManager(this.v);
          this.t.setAdapter(this.u);
          e$c uoc = new e$c(this);
          this.z = uoc;
          this.t.addItemDecoration(uoc);
       }else {
          this.A.e(this.x);
          h.b(new b(q.b(this.A.b()), this.x)).d(this.u);
       }
       return;
    }
    public void J8(){
       PatchProxy.applyVoid(null, this, e.class, "4");
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       this.t = w.a(p0, 0x7f0a34da);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.p = this.r8("EMOTION_PAGE_MODEL");
       this.q = this.r8("EMOTION_PANEL_CONFIG");
       this.r = this.t8("EMOTION_INTERACT_CALLBACK");
       this.s = this.r8("EMOTION_PANEL_WIDTH").intValue();
       return;
    }
}
