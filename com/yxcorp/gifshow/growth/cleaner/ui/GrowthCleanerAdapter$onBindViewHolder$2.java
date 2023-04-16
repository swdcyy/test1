package com.yxcorp.gifshow.growth.cleaner.ui.GrowthCleanerAdapter$onBindViewHolder$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import gna.d;
import gna.b;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mz6.b;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import kotlin.jvm.internal.a;
import android.content.Context;
import android.view.View;
import java.lang.CharSequence;
import mz6.a;
import mz6.a$a;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerHelper;
import cra.c0;
import java.io.File;
import mz6.b$d;
import android.app.Dialog;

public final class GrowthCleanerAdapter$onBindViewHolder$2 extends Lambda implements a	// class@00134c
{
    public final d $holder;
    public final b $model;

    public void GrowthCleanerAdapter$onBindViewHolder$2(d p0,b p1){
       this.$holder = p0;
       this.$model = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, GrowthCleanerAdapter$onBindViewHolder$2.class, "1")) {
          return;
       }
       RecyclerView$ViewHolder itemView = this.$holder.itemView;
       a.o(itemView, "holder.itemView");
       b uob = new b(itemView.getContext());
       b uob1 = this.$holder.e();
       String str = (uob1 != null)? uob1.i(): objArray;
       uob.o(str);
       a uoa = a.z.a();
       uoa.h(GrowthCleanerHelper.c(R.string.arg_RES_7f100599));
       uoa.i(1);
       c0 uoc0 = this.$model.j();
       if (uoc0 != null) {
          objArray = uoc0.e();
       }
       uoa.j(String.valueOf(objArray));
       uoa.k(R.color.arg_RES_7f061da9);
       uoa.m(R.dimen.no);
       uoa.e(1);
       uob.a(uoa.a());
       uob.q();
       return;
    }
}
