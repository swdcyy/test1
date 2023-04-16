package b4d.n0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import oca.a;
import b4d.n0$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import b4d.k0;
import erd.g;
import crd.b;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxDialogFragment;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import brd.x;
import b4d.j0;
import io.reactivex.internal.functions.Functions;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditorFragment;
import android.view.View;
import java.lang.Integer;
import java.util.ArrayList;
import android.content.Context;
import com.yxcorp.utility.n;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;
import java.util.Collection;
import ekd.m1;
import com.yxcorp.gifshow.widget.EmojiEditText;
import android.view.ViewStub;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$Arguments;
import java.util.List;
import a4d.s;
import xk5.a;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditConfig;

public class n0 extends PresenterV2	// class@000381
{
    public View A;
    public EmojiEditText B;
    public View C;
    public View D;
    public ViewStub E;
    public b F;
    public int G;
    public c H;
    public BaseEditorFragment$Arguments p;
    public List q;
    public s r;
    public EmotionFloatEditorFragment s;
    public a t;
    public PublishSubject u;
    public EmotionFloatEditConfig v;
    public PublishSubject w;
    public PublishSubject x;
    public View y;
    public View z;

    public void n0(){
       super();
       this.G = a.a();
       this.H = new n0$a(this);
    }
    public void E8(){
       n0 on0 = n0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, on0, "4")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, on0, "5")) {
          this.X7(this.w.subscribe(new k0(this)));
       }
       if (!PatchProxy.applyVoid(objArray, this, on0, "7")) {
          this.X7(this.s.m().compose(this.s.Ug(FragmentEvent.DESTROY)).subscribe(new j0(this), Functions.d()));
       }
       return;
    }
    public void F8(){
       PatchProxy.applyVoid(null, this, n0.class, "3");
    }
    public void J8(){
       PatchProxy.applyVoid(null, this, n0.class, "8");
    }
    public String P8(int p0){
       String str;
       if (p0 == 2) {
          str = "COLLECT";
       }else if(p0 == 4){
          str = "GIF";
       }else {
          str = null;
       }
       return str;
    }
    public void R8(boolean p0,boolean p1){
       float[] uofloatArray;
       float[] uofloatArray1;
       float[] uofloatArray2;
       n0 on0 = n0.class;
       if (PatchProxy.isSupport(on0) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, on0, "9")) {
          return;
       }
       this.x.onNext(Boolean.valueOf((p0 ^ 0x01)));
       if (p1) {
          this.s.cancel();
          return;
       }else {
          int height = this.y.getHeight();
          n0 tA = this.A;
          if (tA != null && !tA.getVisibility()) {
             height = height + this.A.getHeight();
          }
          int i = (p0)? height: 0;
          if (p0) {
             height = 0;
          }
          if (!PatchProxy.isSupport(on0) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), Integer.valueOf(height), this, on0, "10")) {
             ArrayList uArrayList = new ArrayList(3);
             on0 = this.A;
             int i1 = 2;
             if (on0 != null && !on0.getVisibility()) {
                int i2 = n.c(this.A.getContext(), 5.50f);
                PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, uofloatArray)};
                uofloatArray = new float[i1];
                uofloatArray[0] = (float)(i + i2);
                uofloatArray[1] = (float)(i2 + height);
                uArrayList.add(ObjectAnimator.ofPropertyValuesHolder(this.A, propertyValu));
             }
             PropertyValuesHolder[] propertyValu1 = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, uofloatArray1)};
             uofloatArray1 = new float[i1];
             float f = (float)i;
             uofloatArray1[0] = f;
             float f1 = (float)height;
             uofloatArray1[1] = f1;
             uArrayList.add(ObjectAnimator.ofPropertyValuesHolder(this.y, propertyValu1));
             propertyValu1 = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, uofloatArray2)};
             uofloatArray2 = new float[i1];
             uofloatArray2[0] = f;
             uofloatArray2[1] = f1;
             uArrayList.add(ObjectAnimator.ofPropertyValuesHolder(this.z, propertyValu1));
             AnimatorSet uAnimatorSet = new AnimatorSet();
             uAnimatorSet.playTogether(uArrayList);
             uAnimatorSet.setDuration(150);
             uAnimatorSet.start();
          }
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n0.class, "2")) {
          return;
       }
       this.y = m1.f(p0, 0x7f0a0953);
       this.z = m1.f(p0, 0x7f0a0be0);
       this.A = m1.f(p0, 0x7f0a0272);
       this.B = m1.f(p0, 0x7f0a0ca8);
       this.C = m1.f(p0, 0x7f0a0ce1);
       this.D = m1.f(p0, 0x7f0a0ceb);
       this.E = m1.f(p0, 0x7f0a0d08);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, n0.class, "1")) {
          return;
       }
       this.p = this.r8("args");
       this.q = this.r8("emoji_data");
       this.r = this.q8(s.class);
       this.s = this.r8("floateditor");
       this.t = this.t8("EMOTION_INTERACT_CALLBACK");
       this.u = this.t8("emotion_preview");
       this.v = this.r8("emotion_edit_float_config");
       this.w = this.r8("EMOTION_SHOW_LISTEN");
       this.x = this.r8("EMOTION_SEARCH_SHOW_LISTEN");
       return;
    }
}
