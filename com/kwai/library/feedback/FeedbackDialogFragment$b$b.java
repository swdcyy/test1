package com.kwai.library.feedback.FeedbackDialogFragment$b$b;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import com.kwai.library.feedback.FeedbackDialogFragment$c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.widget.TextView;

public final class FeedbackDialogFragment$b$b extends RecyclerView$ViewHolder	// class@000821
{
    public TextView a;
    public final FeedbackDialogFragment$c b;

    public void FeedbackDialogFragment$b$b(View p0,FeedbackDialogFragment$c p1){
       a.p(p0, "itemView");
       super(p0);
       this.b = p1;
       p0 = p0.findViewById(R.id.item_text);
       a.o(p0, "itemView.findViewById\(R.id.item_text\)");
       this.a = p0;
    }
}
