package com.yxcorp.gifshow.music.cloudmusic.common.viewbinder.AbsCategoryMusicItemViewBinder;
import xob.d;
import xob.c;
import xob.e;
import com.kuaishou.viewbinder.BaseViewBinder;
import c35.c;
import android.view.ViewGroup;

public abstract class AbsCategoryMusicItemViewBinder extends BaseViewBinder implements d, c, e	// class@00200d
{
    public ViewGroup e;
    public ViewGroup f;
    public ViewGroup g;
    public ViewGroup h;
    public KwaiImageView i;
    public KwaiImageView j;
    public TextView k;
    public TextView l;
    public TextView m;
    public TextView n;
    public TextView o;
    public View p;
    public TextView q;
    public LinearLayout r;
    public LinearLayout s;
    public SpectrumView t;
    public PlayBackView u;
    public ConstraintLayout v;
    public View w;
    public LinearLayout x;
    public View y;
    public final int z;

    public void AbsCategoryMusicItemViewBinder(c p0,int p1){
       super(p0);
       this.z = p1;
    }
    public final ViewGroup A(){
       return this.f;
    }
    public final ViewGroup y(){
       return this.g;
    }
    public final ViewGroup z(){
       return this.e;
    }
}