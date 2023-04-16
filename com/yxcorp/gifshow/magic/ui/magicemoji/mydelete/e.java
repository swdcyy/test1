package com.yxcorp.gifshow.magic.ui.magicemoji.mydelete.e;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicFaceAdapter;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicFaceAdapter$a;
import java.util.ArrayList;
import java.lang.String;
import y3b.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.magic.ui.magicemoji.mydelete.ToDeleteMagicFace;
import java.util.Objects;
import java.util.List;
import com.yxcorp.gifshow.magic.ui.magicemoji.mydelete.DeleteTopTitlePresenter$b;
import g9c.a;
import java.lang.Boolean;
import s5b.b;
import java.lang.StringBuilder;
import q87.c;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.magic.ui.magicemoji.mydelete.DeleteTopTitlePresenter$DeleteTopTitleItem;
import android.view.ViewGroup;
import y8c.f;
import android.view.View;
import i2b.a;
import com.yxcorp.gifshow.magic.ui.magicemoji.mydelete.DeleteTopTitlePresenter;
import ml8.c;

public class e extends MagicFaceAdapter	// class@001bdd
{
    public DeleteTopTitlePresenter$DeleteTopTitleItem K;
    public DeleteTopTitlePresenter$DeleteTopTitleItem L;
    public int M;
    public int N;
    public c O;
    public List P;
    public DeleteTopTitlePresenter$b Q;

    public void e(MagicFaceAdapter$a p0,int p1,int p2){
       super(p0);
       this.P = new ArrayList();
       this.M = p1;
       this.N = p2;
    }
    public void P1(int p0,String p1){
       c uoc = c.class;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoe, "10")) {
          return;
       }
       if (p0 >= 0 && p0 < this.getItemCount()) {
          MagicEmoji$MagicFace magicFace = this.u1(p0);
          if (magicFace instanceof ToDeleteMagicFace) {
             e tO = this.O;
             if (tO != null) {
                ToDeleteMagicFace mItemType = magicFace.mItemType;
                if (mItemType == 1) {
                   Objects.requireNonNull(tO);
                   if (!PatchProxy.applyVoidOneRefs(p1, tO, uoc, "4") && !tO.a.contains(p1)) {
                      tO.a.add(p1);
                   }
                }else if(mItemType == 2){
                   Objects.requireNonNull(tO);
                   if (!PatchProxy.applyVoidOneRefs(p1, tO, uoc, "5") && !tO.b.contains(p1)) {
                      tO.b.add(p1);
                   }
                }
             }
          }
          if (!this.P.contains(Integer.valueOf(p0))) {
             this.P.add(Integer.valueOf(p0));
          }
       }
    label_007e :
       return;
    }
    public void Q1(){
       if (PatchProxy.applyVoid(null, this, e.class, "13")) {
          return;
       }
       this.P.clear();
       this.V1(null);
       this.M0();
       return;
    }
    public final int R1(){
       int i = (this.M == null)? -1: 0;
       return i;
    }
    public final int S1(){
       if (this.N == null) {
          return -1;
       }
       e tM = this.M;
       if (tM == null) {
          return 0;
       }
       return (tM + 1);
    }
    public void T1(int p0,boolean p1){
       e uoe1;
       int i2;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, uoe, "5")) {
          return;
       }
       int i = 2;
       int i1 = 1;
       if (p0 == i1) {
          uoe1 = this.M;
          p0 = 1;
       }else if(p0 == i){
          e tM = this.M;
          tM = (tM == null)? 1: tM + i;
          i2 = (this.N + tM) - i1;
       }else {
          p0 = 0;
          i2 = 0;
       }
       int[] ointArray = new int[i];
       ointArray[0] = p0;
       ointArray[i1] = uoe1;
       p0 = this.getItemCount();
       i2 = ointArray[0];
       int i3 = ointArray[i1];
       StringBuilder str = (i2 >= 0 && (i2 <= i3 && i3 < p0))? 1: null;
       if (!str) {
          Object[] objArray = new Object[0];
          b.D().w("MagicFaceDelete", "range position is validate : start "+ointArray[0]+" end "+ointArray[i1]+" itemCount"+p0, objArray);
          return;
       }else if(!q.f(this.Q0())){
          i2 = ointArray[0];
          while (i2 <= ointArray[i1]) {
             MagicEmoji$MagicFace magicFace = this.u1(i2);
             if (magicFace instanceof ToDeleteMagicFace) {
                magicFace.mIsSelected = p1;
                if (p1) {
                   this.P1(i2, magicFace.mId);
                }else {
                   this.U1(i2, magicFace.mId);
                }
             }
             i2 = i2 + 1;
          }
       }
       this.q0(0, p0, Boolean.FALSE);
       return;
    }
    public void U1(int p0,String p1){
       c uoc = c.class;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoe, "11")) {
          return;
       }
       if (p0 >= 0 && p0 < this.getItemCount()) {
          MagicEmoji$MagicFace magicFace = this.u1(p0);
          if (magicFace instanceof ToDeleteMagicFace) {
             e tO = this.O;
             if (tO != null) {
                ToDeleteMagicFace mItemType = magicFace.mItemType;
                if (mItemType == 1) {
                   Objects.requireNonNull(tO);
                   if (!PatchProxy.applyVoidOneRefs(p1, tO, uoc, "6")) {
                      tO.a.remove(p1);
                   }
                }else if(mItemType == 2){
                   Objects.requireNonNull(tO);
                   if (!PatchProxy.applyVoidOneRefs(p1, tO, uoc, "7")) {
                      tO.b.remove(p1);
                   }
                }
             }
          }
          if (this.P.contains(Integer.valueOf(p0))) {
             this.P.remove(Integer.valueOf(p0));
          }
       }
    label_006e :
       return;
    }
    public void V1(DeleteTopTitlePresenter$b p0){
       this.Q = p0;
    }
    public int f0(int p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoe, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (this.u1(p0) instanceof DeleteTopTitlePresenter$DeleteTopTitleItem) {
          return 14;
       }else {
          return super.f0(p0);
       }
    }
    public f h1(ViewGroup p0,int p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoe, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1 == 14) {
          return new f(a.i(p0, 0x7f0d1030), new DeleteTopTitlePresenter(this));
       }else {
          return super.h1(p0, p1);
       }
    }
}
