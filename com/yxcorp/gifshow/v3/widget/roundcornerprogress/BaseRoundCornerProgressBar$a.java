package com.yxcorp.gifshow.v3.widget.roundcornerprogress.BaseRoundCornerProgressBar$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.widget.roundcornerprogress.BaseRoundCornerProgressBar;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class BaseRoundCornerProgressBar$a implements Runnable	// class@001678
{
    public final BaseRoundCornerProgressBar b;

    public void BaseRoundCornerProgressBar$a(BaseRoundCornerProgressBar p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, BaseRoundCornerProgressBar$a.class, "1")) {
          return;
       }
       this.b.drawPrimaryProgress();
       this.b.drawSecondaryProgress();
       return;
    }
}
