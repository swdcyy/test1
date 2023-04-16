package com.yxcorp.gifshow.prettify.makeup.b0$b;
import l16.b;
import com.yxcorp.gifshow.prettify.makeup.b0;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupItem;
import com.yxcorp.gifshow.prettify.makeup.b0$d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xyb.a;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import q87.c;
import com.kwai.feature.post.api.widget.PrettifyLoadingView;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import g9c.a;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupSuite;
import com.kwai.feature.post.api.componet.prettify.makeup.model.RecoSuiteGroup;
import com.yxcorp.gifshow.prettify.makeup.a$b;
import com.yxcorp.gifshow.prettify.v4.magic.filter.PrettifyTagView;
import com.yxcorp.gifshow.prettify.makeup.a;
import e17.i;

public class b0$b implements b	// class@001167
{
    public final MakeupItem a;
    public final b0$d b;
    public final b0 c;

    public void b0$b(b0 p0,MakeupItem p1,b0$d p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void onComplete(){
       if (PatchProxy.applyVoid(null, this, b0$b.class, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("MakeupSuitesAdapter", "downloadRecoMakeup complete : "+this.a.mId, objArray);
       b0$d i1 = this.b.i;
       if (i1 != null) {
          i1.e(i);
       }
       if (this.c.j == this.b.getAdapterPosition() && this.b.getAdapterPosition() != -1) {
          MakeupSuite makeupSuite = this.c.N0(this.b.getAdapterPosition());
          if (makeupSuite instanceof RecoSuiteGroup) {
             this.c.s1(makeupSuite, this.a, this.b.getAdapterPosition());
          }
       }
       return;
    }
    public void onError(){
       if (PatchProxy.applyVoid(null, this, b0$b.class, "2")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("MakeupSuitesAdapter", "downloadRecoMakeup error : "+this.a.mId, objArray);
       b0$d i1 = this.b.i;
       if (i1 != null) {
          i1.e(i);
       }
       MakeupSuite makeupSuite = this.c.N0(this.b.getAdapterPosition());
       if (makeupSuite instanceof RecoSuiteGroup && makeupSuite.getRecoSuite() != null) {
          makeupSuite = makeupSuite.getRecoSuite();
          this.c.e1(this.b.g, makeupSuite.getBottomMaskText(), makeupSuite.getBottomMaskColor(), makeupSuite.getBottomMastSecondColor(), false);
       }else {
          this.c.e1(this.b.g, "", "", "", true);
       }
       i.a(R.style.arg_RES_7f110668, 0x7f101604);
       return;
    }
    public void onProgress(float p0){
    }
}
