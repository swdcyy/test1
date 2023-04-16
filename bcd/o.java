package bcd.o;
import bcd.m;
import java.lang.Object;
import com.yxcorp.plugin.search.entity.IconEntity;
import java.lang.String;
import com.kwai.feature.component.ColorEntity;
import bcd.l;
import iy5.c;
import iy5.b;

public class o implements m	// class@0003eb
{

    public void o(){
       super();
    }
    public IconEntity getGuessLabel(){
       return null;
    }
    public String getKeyword(){
       return " ";
    }
    public ColorEntity getKeywordColor(){
       return l.a(this);
    }
    public int getPosition(){
       return b.a(this);
    }
    public String getRecoReason(){
       return " ";
    }
    public boolean isShowReason(){
       return l.c(this);
    }
    public boolean isShowed(){
       return b.b(this);
    }
    public void setPosition(int p0){
       b.c(this, p0);
    }
    public void setShowed(boolean p0){
       b.d(this, p0);
    }
}
