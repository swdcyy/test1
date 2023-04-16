package com.yxcorp.gifshow.v3.editor.template.v2.viewbinder.PicTemplateListViewBinder$b;
import com.yxcorp.gifshow.util.ARecyclerAdapter$d;
import com.yxcorp.gifshow.v3.editor.template.v2.viewbinder.PicTemplateListViewBinder;
import android.view.ViewGroup;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.yxcorp.gifshow.v3.editor.template.v2.viewbinder.PicTemplateListViewBinder$b$a;
import android.view.View$OnClickListener;
import android.view.View;

public final class PicTemplateListViewBinder$b extends ARecyclerAdapter$d	// class@001392
{
    public final PicTemplateListViewBinder b;

    public void PicTemplateListViewBinder$b(PicTemplateListViewBinder p0,ViewGroup p1){
       a.p(p1, "parent");
       this.b = p0;
       super(p1, 0x7f0d1149);
       this.itemView.setOnClickListener(new PicTemplateListViewBinder$b$a(this));
    }
}
