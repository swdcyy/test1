package com.yxcorp.plugin.setting.entries.holder.l;
import x07.b;
import com.yxcorp.plugin.setting.entries.holder.k$a;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View$OnClickListener;

public class l extends b	// class@000871
{
    public final k$a c;

    public void l(k$a p0,int p1){
       this.c = p0;
       super(p1);
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, l.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       View view = super.a(p0, p1, p2, p3);
       View view1 = view.findViewById(R.id.know_more_text);
       view1.setVisibility(0);
       view1.setOnClickListener(this.c.r);
       return view;
    }
}
