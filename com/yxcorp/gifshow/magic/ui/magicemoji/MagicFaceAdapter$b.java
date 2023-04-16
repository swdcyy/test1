package com.yxcorp.gifshow.magic.ui.magicemoji.MagicFaceAdapter$b;
import androidx.recyclerview.widget.RecyclerView$z;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicFaceAdapter;
import java.util.HashSet;
import androidx.recyclerview.widget.RecyclerView$t;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.util.Iterator;
import java.util.Set;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;

public class MagicFaceAdapter$b extends RecyclerView$z	// class@001bad
{
    public final Set a;
    public final MagicFaceAdapter b;

    public void MagicFaceAdapter$b(MagicFaceAdapter p0){
       this.b = p0;
       super();
       this.a = new HashSet();
    }
    public View a(RecyclerView$t p0,int p1,int p2){
       if (PatchProxy.isSupport(MagicFaceAdapter$b.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, MagicFaceAdapter$b.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0;
          }
       }
       View view = null;
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          View view1 = iterator.next();
          int i = 0x7f0a14dc;
          if (view1.getTag(i) instanceof Integer && (view1.getTag(i).intValue() == p1 && view1.getTag(0x7f0a14db) == this.b.u1(p1))) {
             view = view1;
             break ;
          }
       }
       return view;
    }
}
