package com.yxcorp.gifshow.v3.editor.text.font.adapter.RemoteFontVH$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.v3.editor.text.font.adapter.RemoteFontVH;
import d0c.d;
import com.yxcorp.gifshow.v3.editor.text.font.vm.FontViewModel;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;

public final class RemoteFontVH$a implements View$OnClickListener	// class@00143e
{
    public final RemoteFontVH b;
    public final d c;
    public final FontViewModel d;

    public void RemoteFontVH$a(RemoteFontVH p0,d p1,FontViewModel p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RemoteFontVH$a.class, "1")) {
          return;
       }
       this.c.n(0);
       this.b.i(this.c);
       this.d.q0(this.b.getAdapterPosition());
       return;
    }
}
