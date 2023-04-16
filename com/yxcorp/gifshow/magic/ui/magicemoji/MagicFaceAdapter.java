package com.yxcorp.gifshow.magic.ui.magicemoji.MagicFaceAdapter;
import y8c.g;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicFaceAdapter$a;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicFaceAdapter$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import y8c.f;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import w3b.r;
import com.yxcorp.gifshow.util.rx.RxBus;
import j4b.l;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicEmojiFragment$Source;
import w3b.p;
import j4b.k;
import android.content.Context;
import android.view.ViewGroup;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.content.res.Resources;
import cw9.c;
import java.util.Objects;
import java.util.Set;
import java.lang.Integer;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicFaceAdapter$MagicDeleteEntranceItem;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicFaceAdapter$NoMagicFaceItem;
import g9c.a;
import ekd.k1;
import i2b.a;
import o5b.w;
import com.yxcorp.gifshow.magic.ui.magicemoji.mydelete.f;
import o5b.a;
import o5b.t;
import o5b.o;
import oxa.d;
import ml8.c;
import s5b.b;
import java.lang.StringBuilder;
import q87.c;
import androidx.recyclerview.widget.RecyclerView$z;
import java.util.List;
import d4b.a;
import com.yxcorp.gifshow.plugin.magicemoji.MagicEmojiPageConfig;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicFaceAdapter$c;

public class MagicFaceAdapter extends g	// class@001baf
{
    public String A;
    public MagicFaceAdapter$c B;
    public MagicEmojiPageConfig C;
    public int D;
    public int E;
    public final boolean F;
    public final boolean G;
    public String H;
    public String I;
    public final MagicFaceAdapter$b J;
    public MagicEmojiFragment$Source w;
    public a x;
    public RecyclerView y;
    public a z;

    public void MagicFaceAdapter(MagicFaceAdapter$a p0){
       super();
       this.D = -1;
       this.E = -1;
       this.J = new MagicFaceAdapter$b(this);
       this.w = p0.a;
       this.y = p0.b;
       this.z = p0.c;
       this.A = p0.e;
       this.B = p0.f;
       this.F = p0.i;
       this.x = p0.g;
       this.C = p0.d;
       this.G = p0.j;
    }
    public static MagicFaceAdapter$a H1(){
       Object obj = PatchProxy.apply(null, null, MagicFaceAdapter.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new MagicFaceAdapter$a();
    }
    public int A1(){
       RecyclerView$LayoutManager obj = PatchProxy.apply(null, this, MagicFaceAdapter.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.y.getLayoutManager();
       int i = 5;
       if (obj instanceof GridLayoutManager) {
          i = obj.getSpanCount();
       }
       return i;
    }
    public void B0(RecyclerView$ViewHolder p0){
       this.k1(p0);
    }
    public int C1(){
       return this.D;
    }
    public void D0(RecyclerView$ViewHolder p0){
       this.l1(p0);
    }
    public boolean E1(){
       return this.F;
    }
    public boolean F1(){
       MagicFaceAdapter tE = this.E;
       boolean b = (tE != -1 && tE == this.D)? true: false;
       return b;
    }
    public void I1(){
       MagicFaceAdapter magicFaceAda = MagicFaceAdapter.class;
       if (PatchProxy.applyVoid(null, this, magicFaceAda, "12")) {
          return;
       }
       String str = this.z1();
       SimpleMagicFace simpleMagicF = PatchProxy.apply(null, this, magicFaceAda, "16");
       if (simpleMagicF != PatchProxyResult.class) {
       }else {
          MagicEmoji$MagicFace magicFace = this.y1();
          simpleMagicF = (magicFace != null)? magicFace.mChildId: "";
       }
       if (TextUtils.x(str)) {
          return;
       }else {
          r.a();
          RxBus f = RxBus.f;
          f.b(new l(null, str, simpleMagicF, this.A));
          magicFaceAda = this.w;
          if (magicFaceAda == MagicEmojiFragment$Source.LIVE || magicFaceAda == MagicEmojiFragment$Source.LOCAL_CHAT) {
             p.b().k(this.A, null);
          }
          f.b(new k(null, this.y.getContext()));
          return;
       }
    }
    public final void J1(ViewGroup p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MagicFaceAdapter.class, "4")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = p1.getLayoutParams();
       int i = 0x7f070a69;
       int i1 = 0x7f070a68;
       if (layoutParams == null) {
          layoutParams = new ViewGroup$LayoutParams(c.b(p0.getContext().getResources(), i), c.b(p0.getContext().getResources(), i1));
       }else {
          layoutParams.height = c.b(p0.getContext().getResources(), i1);
          layoutParams.width = c.b(p0.getContext().getResources(), i);
       }
       p1.setLayoutParams(layoutParams);
       return;
    }
    public void L1(String p0){
       this.I = null;
    }
    public Object N0(int p0){
       return this.u1(p0);
    }
    public void N1(String p0){
       this.H = p0;
    }
    public void Z0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MagicFaceAdapter.class, "7")) {
          return;
       }
       super.Z0();
       MagicFaceAdapter tJ = this.J;
       Objects.requireNonNull(tJ);
       if (!PatchProxy.applyVoid(objArray, tJ, MagicFaceAdapter$b.class, "4")) {
          tJ.a.clear();
       }
       return;
    }
    public long d0(int p0){
       return (long)p0;
    }
    public int f0(int p0){
       MagicFaceAdapter magicFaceAda = MagicFaceAdapter.class;
       if (PatchProxy.isSupport(magicFaceAda)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, magicFaceAda, "10");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       MagicEmoji$MagicFace magicFace = this.u1(p0);
       if (magicFace instanceof MagicFaceAdapter$MagicDeleteEntranceItem) {
          return 12;
       }else if(magicFace instanceof MagicFaceAdapter$NoMagicFaceItem){
          return 8;
       }else if(MagicEmoji$MagicFace.isH5Entrance(magicFace)){
          return 10;
       }else if(this.F != null){
          return 11;
       }else if(this.G != null){
          return 13;
       }else {
          return 2;
       }
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, MagicFaceAdapter.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return super.getItemCount();
    }
    public f h1(ViewGroup p0,int p1){
       Object[] obj;
       View view;
       o oo;
       View view1;
       a uoa;
       MagicFaceAdapter magicFaceAda = MagicFaceAdapter.class;
       if (PatchProxy.isSupport(magicFaceAda)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, magicFaceAda, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       long l = k1.i();
       int i = 0x7f0d0930;
       if (p1 != 2) {
          switch (p1){
              case 10:
                view = a.i(p0, i);
                oo = new o(this);
                break;
              case 11:
                view = a.i(p0, R.layout.arg_RES_7f0d0934);
                oo = new t(this, 11);
                break;
              case 12:
                view1 = a.i(p0, R.layout.arg_RES_7f0d092e);
                this.J1(p0, view1);
                uoa = new a(this);
             label_007a :
                oo = uoa;
                view = view1;
                break;
              case 13:
                view = a.i(p0, i);
                oo = new f(this);
                break;
              default:
                view = a.i(p0, R.layout.arg_RES_7f0d0933);
                oo = new w(this);
          }
       }else {
          view1 = d.d().f(p0.getContext(), i);
          this.J1(p0, view1);
          uoa = new t(this);
          goto label_007a ;
       }
       obj = new Object[0];
       b.D().s("MagicFaceAdapter", p1+" onCreatePresenterHolder cost "+k1.t(l), obj);
       return new f(view, oo);
    }
    public void k1(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicFaceAdapter.class, "5")) {
          return;
       }
       super.k1(p0);
       MagicFaceAdapter tJ = this.J;
       RecyclerView$ViewHolder itemView = p0.itemView;
       Objects.requireNonNull(tJ);
       if (!PatchProxy.applyVoidOneRefs(itemView, tJ, MagicFaceAdapter$b.class, "2")) {
          tJ.a.add(itemView);
       }
       return;
    }
    public void l1(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicFaceAdapter.class, "6")) {
          return;
       }
       super.l1(p0);
       MagicFaceAdapter tJ = this.J;
       RecyclerView$ViewHolder itemView = p0.itemView;
       Objects.requireNonNull(tJ);
       if (!PatchProxy.applyVoidOneRefs(itemView, tJ, MagicFaceAdapter$b.class, "3")) {
          tJ.a.remove(itemView);
       }
       return;
    }
    public void r1(){
       if (PatchProxy.applyVoid(null, this, MagicFaceAdapter.class, "1")) {
          return;
       }
       this.y.setViewCacheExtension(this.J);
       return;
    }
    public void s1(int p0){
       MagicFaceAdapter magicFaceAda = MagicFaceAdapter.class;
       if (PatchProxy.isSupport(magicFaceAda) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, magicFaceAda, "11")) {
          return;
       }
       if (this.x != null && this.F1()) {
          if ((p0 + 15) > this.e.size()) {
             this.x.n();
          }
          p0++;
          if (p0 == this.e.size()) {
             this.x.a();
          }
       }
    label_003e :
       return;
    }
    public String t1(){
       return this.H;
    }
    public MagicEmoji$MagicFace u1(int p0){
       MagicFaceAdapter magicFaceAda = MagicFaceAdapter.class;
       if (PatchProxy.isSupport(magicFaceAda)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, magicFaceAda, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return super.N0(p0);
    }
    public MagicEmojiPageConfig v1(){
       return this.C;
    }
    public String w1(){
       return this.A;
    }
    public MagicFaceAdapter$c x1(){
       return this.B;
    }
    public MagicEmoji$MagicFace y1(){
       Object obj = PatchProxy.apply(null, this, MagicFaceAdapter.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p.b().c(this.A);
    }
    public String z1(){
       MagicEmoji$MagicFace obj = PatchProxy.apply(null, this, MagicFaceAdapter.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.y1();
       SimpleMagicFace mId = (obj != null)? obj.mId: "";
       return mId;
    }
}
