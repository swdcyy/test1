package com.hhh.mvvm.recycler.DefaultEmptyFragment;
import com.hhh.mvvm.base.BaseFragment;
import android.view.View;
import android.os.Bundle;
import com.trello.rxlifecycle3.components.support.RxFragment;
import androidx.fragment.app.Fragment;
import com.hhh.mvvm.recycler.RecyclerFragment;
import com.hhh.mvvm.recycler.k;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LifecycleOwner;
import fm.c;
import androidx.lifecycle.Observer;
import fm.b;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class DefaultEmptyFragment extends BaseFragment	// class@000562
{
    public static final int c;

    public void DefaultEmptyFragment(){
       super();
    }
    public int getLayoutResId(){
       return 0x7f0d102e;
    }
    public void onViewCreated(View p0,Bundle p1){
       super.onViewCreated(p0, p1);
       k ok = this.getParentFragment().Yg();
       ok.o0().observe(this.getViewLifecycleOwner(), new c(this));
       this.Vg(R.id.btn_refresh_error_page).setOnClickListener(new b(ok));
       this.Vg(R.id.img_icon_error_page).setImageResource(R.drawable.arg_RES_7f081837);
       this.Vg(R.id.tv_description_error_page).setText(R.string.arg_RES_7f1035a8);
    }
}
