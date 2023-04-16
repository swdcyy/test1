package com.yxcorp.gifshow.camera.record.frame.f;
import g9c.a;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.yxcorp.gifshow.camera.record.frame.f$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.camera.record.frame.FrameModeInfo;
import oe6.e;
import android.widget.TextView;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import com.yxcorp.gifshow.model.PassThroughParams;
import java.util.Collection;
import ekd.q;
import q5b.l;
import kd9.d0;
import android.view.View$OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import i2b.a;

public class f extends a	// class@000de4
{
    public MagicEmoji$MagicFace g;
    public f$b h;
    public boolean i;

    public void f(MagicEmoji$MagicFace p0,boolean p1){
       super();
       this.g = p0;
       this.i = p1;
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       f uof = f.class;
       if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uof, "2")) {
          FrameModeInfo uFrameModeIn = this.N0(p1);
          if (uFrameModeIn != null) {
             f$a c = p0.c;
             boolean b = true;
             boolean b1 = (uFrameModeIn.mFrameMode == e.k())? true: false;
             c.setSelected(b1);
             p0.c.setText(uFrameModeIn.mText);
             if (this.i != null) {
                p0.c.setCompoundDrawablesWithIntrinsicBounds(0, 0, uFrameModeIn.mIconRes, 0);
             }else {
                p0.c.setCompoundDrawablesWithIntrinsicBounds(0, uFrameModeIn.mIconRes, 0, 0);
             }
             uof = this.g;
             if (uof != null) {
                MagicBaseConfig mPassThrough = uof.mPassThroughParams;
                if (mPassThrough != null && !q.f(mPassThrough.mPreviewScales)) {
                   p0.c.setEnabled(l.b(uFrameModeIn.mFrameMode, this.g));
                }else {
                   c = p0.c;
                   if (uFrameModeIn.mFrameMode != b) {
                      b = false;
                   }
                   c.setEnabled(b);
                }
             }else {
                p0.c.setEnabled(b);
             }
             p0.b.setOnClickListener(new d0(this, p0, uFrameModeIn));
          }
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       f$a uoa;
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          uoa = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uof, "1");
          if (uoa != PatchProxyResult.class) {
          label_0032 :
             return uoa;
          }
       }
       uoa = (this.i != null)? 0x7f0d159f: 0x7f0d159e;
       uoa = new f$a(this, a.d(p0.getContext(), uoa, p0, false));
       goto label_0032 ;
    }
}
