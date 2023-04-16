package com.yxcorp.gifshow.magic.ui.magicemoji.mydelete.c;
import com.yxcorp.gifshow.magic.ui.magicemoji.mydelete.DeleteTopTitlePresenter$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import y3b.c;
import com.yxcorp.gifshow.magic.ui.magicemoji.mydelete.b;
import com.yxcorp.gifshow.magic.ui.magicemoji.mydelete.c$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import java.util.Objects;
import com.yxcorp.gifshow.magic.ui.magicemoji.mydelete.a;
import android.view.View;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.magic.ui.magicemoji.mydelete.c$b;
import com.yxcorp.gifshow.magic.ui.magicemoji.mydelete.e;
import com.yxcorp.gifshow.magic.ui.magicemoji.mydelete.DeleteTopTitlePresenter$b;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicFaceAdapter;
import com.yxcorp.gifshow.magic.ui.magicemoji.mydelete.DeleteTopTitlePresenter$DeleteTopTitleItem;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Collection;
import ekd.q;
import java.lang.Integer;
import com.yxcorp.gifshow.magic.ui.magicemoji.mydelete.ToDeleteMagicFace;
import s5b.b;
import q87.c;
import java.lang.StringBuilder;
import java.lang.Number;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class c extends PresenterV2 implements DeleteTopTitlePresenter$a	// class@001bda
{
    public DeleteTopTitlePresenter$b A;
    public final c p;
    public b q;
    public BaseFragment r;
    public e s;
    public c$b t;
    public boolean u;
    public a v;
    public View w;
    public a$b x;
    public boolean y;
    public boolean z;

    public void c(){
       super();
       this.p = new c();
       this.x = new b(this);
       this.A = new c$a(this);
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "3")) {
          return;
       }
       FragmentActivity activity = this.r.getActivity();
       if (activity != null) {
          c tw = this.w;
          if (tw != null) {
             c tv = this.v;
             c tx = this.x;
             Objects.requireNonNull(tv);
             if (!PatchProxy.applyVoidThreeRefs(tw, activity, tx, tv, a.class, "1")) {
                tv.c = activity;
                tv.d = tx;
                View view = tw.findViewById(R.id.delete_btn);
                tv.b = view;
                if (view != null) {
                   view.setEnabled(false);
                   tv.b.setAlpha(0x3f000000);
                   tv.b.setOnClickListener(tv.a);
                }
             }
          }
       }
       this.t = new c$b(this.r);
       c ts = this.s;
       ts.O = this.p;
       ts.V1(this.A);
       ts = this.s;
       Objects.requireNonNull(ts);
       if (!PatchProxy.applyVoid(objArray, ts, e.class, "4")) {
          MagicEmoji$MagicFace magicFace = ts.u1(ts.R1());
          if (magicFace instanceof DeleteTopTitlePresenter$DeleteTopTitleItem) {
             ts.K = magicFace;
          }
          magicFace = ts.u1(ts.S1());
          if (magicFace instanceof DeleteTopTitlePresenter$DeleteTopTitleItem) {
             ts.L = magicFace;
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       c tv = this.v;
       Objects.requireNonNull(tv);
       if (!PatchProxy.applyVoid(null, tv, a.class, "2")) {
          a b = tv.b;
          if (b != null) {
             b.setOnClickListener(null);
          }
          tv.d = null;
       }
       this.t.b = null;
       this.t = null;
       this.x = null;
       this.s.Q1();
       return;
    }
    public void P8(){
       int b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "6")) {
          return;
       }
       c tv = this.v;
       c tp = this.p;
       Objects.requireNonNull(tp);
       Object obj = PatchProxy.apply(objArray, tp, c.class, "9");
       int i = 1;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(q.f(tp.a) && q.f(tp.b)){
          b = 1;
       }else {
          b = 0;
       }
       b = b ^ i;
       Objects.requireNonNull(tv);
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), tv, uoa, "3")) {
          uoa = tv.b;
          if (uoa != null && uoa.isEnabled() != b) {
             tv.b.setEnabled(b);
             a b1 = tv.b;
             float f = (b)? 0x3f800000: 0x3f000000;
             b1.setAlpha(f);
          }
       }
       return;
    }
    public void ca(String p0,int p1,boolean p2){
       int i;
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, c.class, "7")) {
          return;
       }
       String str = "MagicFaceDelete";
       if (p1 < 0 || p1 >= this.s.getItemCount()) {
          Object[] objArray = new Object[0];
          b.D().w(str, "selectToDeleteMagicFace position error, size:"+this.s.getItemCount()+" position:"+p1, objArray);
          return;
       }else if(!this.s.u1(p1) instanceof ToDeleteMagicFace){
          Object[] objArray1 = new Object[0];
          b.D().w(str, "select item is not ToDeleteMagicFace", objArray1);
          return;
       }else {
          Object[] objArray2 = new Object[0];
          b.D().w(str, "select magic face \(magicId "+p0+" position "+p1+"\)", objArray2);
          if (p2) {
             this.s.P1(p1, p0);
          }else {
             this.s.U1(p1, p0);
             c ts = this.s;
             Objects.requireNonNull(ts);
             e uoe = e.class;
             if (PatchProxy.isSupport(uoe)) {
                Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p1), ts, uoe, "12");
                if (obj != PatchProxyResult.class) {
                   i = obj.intValue();
                }else if(p1 < 0 || p1 >= ts.getItemCount()){
                   MagicEmoji$MagicFace magicFace = ts.u1(p1);
                   if (magicFace instanceof ToDeleteMagicFace) {
                      i = magicFace.mItemType;
                   }
                }
                i = -1;
             }else {
                goto label_0098 ;
             }
             if (i != 1) {
                if (i == 2 && this.z != null) {
                   this.z = false;
                }
             }else if(this.y != null){
                this.y = false;
             }
          }
       label_00c4 :
          this.P8();
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       this.w = p0;
       this.v = new a();
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.r = this.r8("FRAGMENT");
       this.s = this.r8("MAGIC_DELETE_ADAPTER");
       return;
    }
    public void k6(View p0,MagicEmoji$MagicFace p1){
    }
}
