package jg9.t0$b;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.camera.record.widget.RoundedImageView;
import android.widget.TextView;

public final class t0$b extends RecyclerView$ViewHolder	// class@002ab5
{
    public final RoundedImageView a;
    public final TextView b;
    public final View c;
    public final View d;

    public void t0$b(View p0){
       a.p(p0, "itemView");
       super(p0);
       View view = p0.findViewById(R.id.picture_iv);
       a.o(view, "itemView.findViewById\(R.id.picture_iv\)");
       this.a = view;
       view = p0.findViewById(R.id.media_select_info);
       a.o(view, "itemView.findViewById\(R.id.media_select_info\)");
       this.b = view;
       view = p0.findViewById(R.id.real_close_btn);
       a.o(view, "itemView.findViewById\(R.id.real_close_btn\)");
       this.c = view;
       p0 = p0.findViewById(R.id.multi_take_picture_item_recommend_tag);
       a.o(p0, "itemView.findViewById\(R.¡­cture_item_recommend_tag\)");
       this.d = p0;
    }
    public final TextView a(){
       return this.b;
    }
    public final RoundedImageView b(){
       return this.a;
    }
}
