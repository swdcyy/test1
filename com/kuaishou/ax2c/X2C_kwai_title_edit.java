package com.kuaishou.ax2c.X2C_kwai_title_edit;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Kwai_Title_Edit;

public class X2C_kwai_title_edit implements IViewCreator	// class@000ff7
{

    public void X2C_kwai_title_edit(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Kwai_Title_Edit().createView(p0);
    }
}
