package androidx.recyclerview.widget.SlideVerticalAtlasPlayer$b;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.SparseIntArray;
import java.util.HashMap;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import androidx.recyclerview.widget.SlideVerticalAtlasPlayer$b$a;
import androidx.recyclerview.widget.SlideVerticalAtlasPlayer$b$b;
import ud5.c;
import ud5.d;
import android.view.ViewGroup;
import com.kwai.component.photo.detail.core.atlas.SlideAtlasItemView;
import android.content.Context;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import qrd.l1;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView;

public final class SlideVerticalAtlasPlayer$b extends RecyclerView$Adapter	// class@0008ca
{
    public final SparseIntArray e;
    public final HashMap f;
    public c g;
    public d h;
    public final QPhoto i;

    public void SlideVerticalAtlasPlayer$b(QPhoto p0){
       a.p(p0, "photo");
       super();
       this.i = p0;
       this.e = new SparseIntArray();
       this.f = new HashMap();
    }
    public void B0(RecyclerView$ViewHolder p0){
       this.M0(p0);
    }
    public final HashMap J0(){
       return this.f;
    }
    public void K0(SlideVerticalAtlasPlayer$b$a p0,int p1){
       a.p(p0, "holder");
       p0.b(this.i, p1, this.g, new SlideVerticalAtlasPlayer$b$b(this));
    }
    public SlideVerticalAtlasPlayer$b$a L0(ViewGroup p0,int p1){
       a.p(p0, "parent");
       Context context = p0.getContext();
       a.o(context, "parent.context");
       SlideAtlasItemView slideAtlasIt = new SlideAtlasItemView(context);
       slideAtlasIt.setLayoutParams(new FrameLayout$LayoutParams(-1, -2));
       slideAtlasIt.getImageView().setId(R.id.vertical_cover);
       slideAtlasIt.getLoadingView().setId(R.id.vertical_loading_progress_bar);
       return new SlideVerticalAtlasPlayer$b$a(p0, slideAtlasIt);
    }
    public void M0(SlideVerticalAtlasPlayer$b$a p0){
       a.p(p0, "holder");
       int absoluteAdap = p0.getAbsoluteAdapterPosition();
       this.e.put(absoluteAdap, (this.e.get(absoluteAdap) + 1));
    }
    public final void N0(c p0){
       a.p(p0, "imgLoadListener");
       this.g = p0;
    }
    public int getItemCount(){
       return this.i.getAtlasList().size();
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       this.K0(p0, p1);
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       return this.L0(p0, p1);
    }
    public void z0(RecyclerView p0){
       a.p(p0, "recyclerView");
       this.e.clear();
       this.f.clear();
    }
}
