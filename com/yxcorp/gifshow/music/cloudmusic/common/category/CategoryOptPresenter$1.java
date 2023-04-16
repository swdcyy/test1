package com.yxcorp.gifshow.music.cloudmusic.common.category.CategoryOptPresenter$1;
import androidx.recyclerview.widget.GridLayoutManager;
import com.yxcorp.gifshow.music.cloudmusic.common.category.CategoryOptPresenter;
import android.content.Context;

public class CategoryOptPresenter$1 extends GridLayoutManager	// class@002006
{
    public final CategoryOptPresenter A;

    public void CategoryOptPresenter$1(CategoryOptPresenter p0,Context p1,int p2){
       this.A = p0;
       super(p1, p2);
    }
    public boolean canScrollVertically(){
       return false;
    }
}
