package com.kuaishou.ax2c.PreLoader$1;
import java.lang.Runnable;
import com.kuaishou.ax2c.PreLoader;
import android.content.Context;
import java.lang.Object;
import android.content.res.Resources;
import java.lang.String;

public class PreLoader$1 implements Runnable	// class@000fb8
{
    public final PreLoader this$0;
    public final Context val$context;
    public final int val$resId;

    public void PreLoader$1(PreLoader p0,Context p1,int p2){
       this.this$0 = p0;
       this.val$context = p1;
       this.val$resId = p2;
       super();
    }
    public void run(){
       this.val$context.getResources().getString(this.val$resId);
    }
}
