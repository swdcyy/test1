package com.yxcorp.gifshow.comment.utils.e;
import android.content.Context;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.comment.e;
import yk9.d;
import com.yxcorp.gifshow.comment.editor.CommentEditorConfig;
import java.lang.Object;
import com.yxcorp.gifshow.widget.d;
import android.app.Activity;
import e3a.a;
import hk9.b;
import com.yxcorp.gifshow.comment.utils.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.CharSequence;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import android.text.SpannableString;
import com.yxcorp.utility.TextUtils;
import android.text.Spannable;
import ak5.j;
import android.view.View;
import com.yxcorp.gifshow.comment.utils.d;
import com.yxcorp.gifshow.comment.utils.e$d;
import android.content.DialogInterface$OnDismissListener;
import java.lang.Boolean;
import java.lang.Integer;
import kk9.d;
import hl9.a;
import rkd.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import zg5.a;
import com.yxcorp.gifshow.comment.fragment.CommentsFragment;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import kk9.c;
import com.yxcorp.gifshow.comment.utils.e$c;
import com.yxcorp.gifshow.comment.utils.e$b;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$c;
import hl9.d0;
import android.view.View$OnClickListener;
import hl9.f0;
import java.lang.Runnable;
import hl9.b0;
import androidx.fragment.app.KwaiDialogFragment;
import hl9.c0;
import android.content.DialogInterface$OnShowListener;
import java.lang.ref.WeakReference;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import java.lang.StringBuilder;
import android.os.Build;
import k2b.u1;
import kk9.b;
import hl9.e0;
import com.kwai.emotionsdk.bean.EmotionInfo;
import com.yxcorp.gifshow.models.QMedia;
import kk9.b$a;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$g;
import e17.i$b;
import e17.i;
import com.yxcorp.gifshow.comment.utils.e$a;
import com.kuaishou.android.model.mix.QComment;
import com.yxcorp.gifshow.comment.utils.b$a;
import nk9.a;
import java.util.List;
import java.util.HashSet;
import org.greenrobot.eventbus.a;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.detail.event.PlayEvent;
import com.yxcorp.gifshow.detail.event.PlayEvent$Status;
import ek9.a;
import hl9.g0;
import msd.l;
import crd.b;
import ok.x;
import java.lang.Long;
import com.yxcorp.gifshow.activity.x;
import yk9.c;
import k2b.e0;
import ek9.m1;
import java.lang.Throwable;
import q87.c;
import android.text.TextUtils$TruncateAt;
import com.yxcorp.gifshow.widget.EmojiTextView;
import com.yxcorp.gifshow.widget.KSTextDisplayHandler;
import com.kwai.library.widget.textview.KwaiBaseTextView;

public class e	// class@001112
{
    public String A;
    public b B;
    public final Context a;
    public final QPhoto b;
    public EmotionInfo c;
    public QMedia d;
    public TextView e;
    public View f;
    public BaseEditorFragment$c g;
    public DialogInterface$OnShowListener h;
    public DialogInterface$OnDismissListener i;
    public e$d j;
    public WeakReference k;
    public QComment l;
    public e$c m;
    public CharSequence n;
    public d o;
    public e p;
    public b q;
    public c r;
    public CommentEditorConfig s;
    public d t;
    public d u;
    public BaseEditorFragment$g v;
    public x w;
    public boolean x;
    public HashSet y;
    public boolean z;

    public void e(Context p0,QPhoto p1,e p2,d p3,int p4){
       super(p0, p1, p2, p3, p4, null);
    }
    public void e(Context p0,QPhoto p1,e p2,d p3,int p4,CommentEditorConfig p5){
       super();
       this.s = new CommentEditorConfig();
       this.t = new d();
       this.A = "RIGHT_COMMENT_BUTTON";
       this.a = a.b(p0);
       this.b = p1;
       this.o = (p3 != null)? p3: new d(p1);
       if (p5 != null) {
          this.s = p5.copy();
       }
       this.p = p2;
       b uob = new b();
       uob.b(this.s);
       uob.c(p1);
       p1.mFloatEditorTheme = p4;
       this.r = uob;
       this.B = new b(this.c());
       this.t.e(true);
       this.t.d(false);
       return;
    }
    public void A(CharSequence p0){
       String str;
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoe, "16")) {
          return;
       }
       e te = this.e;
       if (te == null) {
          return;
       }
       float textSize = te.getTextSize();
       if (PatchProxy.isSupport(uoe)) {
          str = PatchProxy.applyTwoRefs(p0, Float.valueOf(textSize), this, uoe, "20");
          if (str != PatchProxyResult.class) {
          }else if(this.e == null){
             str = "";
          }else {
             str = new SpannableString(p0);
             if (!TextUtils.x(p0)) {
                this.t.a(str);
                if (j.o().t()) {
                   j.o().f(str, this.e, textSize);
                }
             }
          }
       }else {
          goto label_002b ;
       }
       this.e.setText(str);
       if (TextUtils.x(str)) {
          this.e.scrollTo(0, 0);
       }
       float f = (!d.b(this.k()))? 0x3f000000: 0x3f800000;
       uoe = this.f;
       if (uoe != null) {
          uoe.setAlpha(f);
       }
       uoe = this.j;
       if (uoe != null) {
          uoe.a(f);
       }
       return;
    }
    public void B(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e.class, "6")) {
          return;
       }
       String str = this.k();
       e tn = this.n;
       if (tn != null) {
          objArray = tn.toString();
       }
       this.D(str, false, null, Integer.MAX_VALUE, objArray);
       return;
    }
    public void C(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "5")) {
          return;
       }
       this.D(this.k(), false, null, Integer.MAX_VALUE, p0);
       return;
    }
    public void D(String p0,boolean p1,DialogInterface$OnDismissListener p2,int p3,String p4){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object[] objArray = new Object[]{p0,Boolean.valueOf(p1),null,Integer.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, this, uoe, "9")) {
             return;
          }
       }
       this.E(p0, p1, false, null, p3, p4);
       return;
    }
    public void E(String p0,boolean p1,boolean p2,DialogInterface$OnDismissListener p3,int p4,String p5){
       if (PatchProxy.isSupport(e.class)) {
          Object[] objArray = new Object[]{p0,Boolean.valueOf(p1),Boolean.valueOf(p2),p3,Integer.valueOf(p4),p5};
          if (PatchProxy.applyVoid(objArray, this, e.class, "11")) {
             return;
          }
       }
       if (!this.b.isAllowComment()) {
          return;
       }else {
          d uod = new d();
          if (TextUtils.x(p5)) {
             p5 = a.a(this.b);
          }
          uod.f = p5;
          uod.e = this.l;
          uod.d = p2;
          uod.c = p1;
          uod.l = this.x;
          uod.g = p0;
          uod.h = p4;
          uod.i = this.c;
          uod.j = this.d;
          uod.m = this.s.mForceDayNightMode;
          uod.k = this.A;
          e ty = this.y;
          if (ty != null) {
             uod.n = ty;
          }
          this.u = uod;
          if (b.b() && b.e()) {
             RxBus.f.b(new a(1));
          }
          BaseEditorFragment uBaseEditorF = this.r.a(this.c(), uod, null);
          e tm = this.m;
          if (tm != null) {
             tm.a(uBaseEditorF);
          }
          uBaseEditorF.ai(new e$b(this));
          uBaseEditorF.ci(new d0(this));
          uBaseEditorF.bi(new f0(this));
          uBaseEditorF.k0(new b0(this, p3));
          uBaseEditorF.ph(new c0(this));
          this.k = new WeakReference(uBaseEditorF);
          if (!this.c().isFinishing()) {
             uBaseEditorF.show(this.c().getSupportFragmentManager(), e.class.getName());
          }else {
             u1.Q("BadTokenSuspect", "Model:"+Build.MODEL);
          }
          return;
       }
    }
    public void F(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "8")) {
          return;
       }
       this.E(p0, false, true, null, Integer.MAX_VALUE, null);
       return;
    }
    public final void G(){
       if (PatchProxy.applyVoid(null, this, e.class, "24")) {
          return;
       }
       if (this.q == null) {
          return;
       }
       if (this.d != null || this.c != null) {
          this.v("");
          this.q.a(0);
       }else {
          this.v(this.n);
          this.q.a(8);
       }
       this.q.c(this.c, this.d, new e0(this));
       return;
    }
    public void a(BaseEditorFragment$g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "10")) {
          return;
       }
       if (TextUtils.x((p0.c).trim()) && (p0.e == null && p0.f == null)) {
          i$b uob = i.m();
          uob.x(R.string.arg_RES_7f104252);
          uob.l(true);
          i.c(R.style.arg_RES_7f11066a, uob);
          return;
       }else if(!this.B.i("commentKeywordActionConfiguration", p0.c, null, new e$a(this, p0), "HUMANISTIC_CARE")){
          this.n(p0);
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, e.class, "21")) {
          return;
       }
       this.A("");
       this.l = null;
       this.t(null);
       this.y(null);
       return;
    }
    public GifshowActivity c(){
       return this.a;
    }
    public d d(){
       return this.o;
    }
    public d e(){
       return this.u;
    }
    public EmotionInfo f(){
       return this.c;
    }
    public BaseEditorFragment g(){
       Object obj = PatchProxy.apply(null, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.k.get();
    }
    public CharSequence h(){
       e obj = PatchProxy.apply(null, this, e.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.e;
       String str = (obj == null)? "": obj.getHint();
       return str;
    }
    public QMedia i(){
       return this.d;
    }
    public QComment j(){
       return this.l;
    }
    public String k(){
       e obj = PatchProxy.apply(null, this, e.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.e;
       if (obj == null || TextUtils.x(obj.getText())) {
          return "";
       }
       return this.e.getText().toString();
    }
    public void l(BaseEditorFragment$g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "12")) {
          return;
       }
       e tm = this.m;
       if (tm != null) {
          tm.c(p0);
       }
       a uoa = new a(this.b, p0.c, p0.e, p0.f, null, p0.r, p0.s, this.c().hashCode());
       e tl = (tm.a())? this.l: null;
       tm.b(tl);
       a.d().k(tm);
       return;
    }
    public void m(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e.class, "4")) {
          return;
       }
       e tk = this.k;
       if (tk != null) {
          objArray = tk.get();
       }
       if (objArray != null && objArray.isVisible()) {
          objArray.dismiss();
       }
       return;
    }
    public void n(BaseEditorFragment$g p0){
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoe, "13")) {
          return;
       }
       a.d().k(new PlayEvent(this.b, PlayEvent$Status.RESUME));
       if (p0.a == null) {
          try{
             a uoa = PatchProxy.applyOneRefs(p0, this, uoe, "14");
             if (uoa != PatchProxyResult.class) {
             }else {
                uoa = a.d(this.b, new g0(this, p0));
             }
             e tm = this.m;
             if (tm == null || !tm.b(p0).booleanValue()) {
                this.p.i(this.c(), uoa);
             }
             d uod = this.d();
             QComment qComment = uoa.e();
             boolean b = uoa.r();
             String str = uoa.n();
             e tw = this.w;
             long l = (tw != null)? tw.get().longValue(): 0;
             uod.G(qComment, b, str, null, l, this.c().N2());
          }catch(java.lang.Exception e11){
             Object[] objArray = new Object[0];
             m1.C().u("PhotoEditHolderHelper", e11, objArray);
          }
       }
    }
    public e o(View p0){
       this.f = p0;
       return this;
    }
    public e p(x p0){
       this.w = p0;
       return this;
    }
    public void q(e$c p0){
       this.m = p0;
    }
    public void r(TextView p0){
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoe, "1")) {
          return;
       }
       this.e = p0;
       if (!PatchProxy.applyVoid(null, this, uoe, "25")) {
          uoe = this.e;
          if (uoe != null) {
             uoe.setVerticalScrollBarEnabled(false);
             this.e.setMaxLines(1);
             this.e.setSingleLine();
             this.e.setEllipsize(TextUtils$TruncateAt.END);
          }
       }
       this.n = this.h();
       if (p0 instanceof EmojiTextView) {
          p0.setKSTextDisplayHandler(null);
          p0.setAllowCustomOnTouchEvent(false);
       }
       return;
    }
    public void s(BaseEditorFragment$c p0){
       this.g = p0;
    }
    public void t(EmotionInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "22")) {
          return;
       }
       if (p0 != null) {
          this.d = null;
       }
       this.c = p0;
       this.G();
       return;
    }
    public void u(int p0){
       this.s.mForceDayNightMode = p0;
    }
    public final void v(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "15")) {
          return;
       }
       e te = this.e;
       if (te == null) {
          return;
       }
       te.setHint(p0);
       return;
    }
    public void w(DialogInterface$OnDismissListener p0){
       this.i = p0;
    }
    public void x(DialogInterface$OnShowListener p0){
       this.h = p0;
    }
    public void y(QMedia p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "23")) {
          return;
       }
       if (p0 != null) {
          this.c = null;
       }
       this.d = p0;
       this.G();
       return;
    }
    public void z(QComment p0){
       this.l = p0;
    }
}
