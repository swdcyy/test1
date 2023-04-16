package com.kuaishou.post.story.publish.d;
import erd.o;
import com.kuaishou.post.story.publish.g;
import java.lang.Object;
import android.util.Pair;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.kuaishou.post.story.entrance.vm.MoodTemplateViewModel;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import brd.a0;
import oq4.d;

public final class d implements o	// class@000b82
{
    public final g b;

    public void d(g p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       return ViewModelProviders.of(this.b.r).get(MoodTemplateViewModel.class).E0(false).C(new d(p0));
    }
}
