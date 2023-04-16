package com.yxcorp.gifshow.v3.editor.text.textpanel.style.TextStyleViewBinder$b;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.yxcorp.gifshow.v3.editor.text.textpanel.style.TextStyleViewBinder;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.text.textpanel.style.TextColorView;

public final class TextStyleViewBinder$b extends RecyclerView$ViewHolder	// class@0014d7
{
    public final TextColorView a;
    public final TextStyleViewBinder b;

    public void TextStyleViewBinder$b(TextStyleViewBinder p0,View p1){
       a.p(p1, "itemView");
       this.b = p0;
       super(p1);
       View view = p1.findViewById(R.id.text_color_view);
       a.o(view, "itemView.findViewById\(R.id.text_color_view\)");
       this.a = view;
    }
}
