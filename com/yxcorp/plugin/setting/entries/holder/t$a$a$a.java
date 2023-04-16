package com.yxcorp.plugin.setting.entries.holder.t$a$a$a;
import x07.b;
import com.yxcorp.plugin.setting.entries.holder.t$a$a;
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
import com.yxcorp.plugin.setting.entries.holder.t$a$a$a$a;
import android.view.View$OnClickListener;

public class t$a$a$a extends b	// class@00088e
{
    public final t$a$a c;

    public void t$a$a$a(t$a$a p0,int p1){
       this.c = p0;
       super(p1);
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, t$a$a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       View view = super.a(p0, p1, p2, p3);
       view.findViewById(R.id.back_arrow).setOnClickListener(new t$a$a$a$a(this, p0));
       return view;
    }
}
