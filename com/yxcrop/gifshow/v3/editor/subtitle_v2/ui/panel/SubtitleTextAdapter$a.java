package com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.panel.SubtitleTextAdapter$a;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.widget.TextView;

public final class SubtitleTextAdapter$a extends RecyclerView$ViewHolder	// class@000af0
{
    public final View a;
    public final TextView b;
    public final TextView c;
    public final View d;
    public final View e;

    public void SubtitleTextAdapter$a(View p0){
       a.p(p0, "itemView");
       super(p0);
       View view = p0.findViewById(R.id.root);
       a.o(view, "itemView.findViewById\(R.id.root\)");
       this.a = view;
       view = p0.findViewById(R.id.time);
       a.o(view, "itemView.findViewById\(R.id.time\)");
       this.b = view;
       view = p0.findViewById(R.id.content);
       a.o(view, "itemView.findViewById\(R.id.content\)");
       this.c = view;
       view = p0.findViewById(R.id.time_adjust);
       a.o(view, "itemView.findViewById\(R.id.time_adjust\)");
       this.d = view;
       p0 = p0.findViewById(R.id.content_adjust);
       a.o(p0, "itemView.findViewById\(R.id.content_adjust\)");
       this.e = p0;
    }
    public final TextView a(){
       return this.c;
    }
    public final View b(){
       return this.e;
    }
    public final View c(){
       return this.d;
    }
}
