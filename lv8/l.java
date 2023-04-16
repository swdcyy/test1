package lv8.l;
import com.yxcorp.gateway.pay.params.webview.JsPageButtonParams;
import java.lang.String;
import android.view.View$OnClickListener;

public interface abstract l	// class@002db6
{

    void bindTextButton(int p0,JsPageButtonParams p1);
    String getLeftTopButtonType();
    void handleFinished(String p0);
    void setImageRes(int p0,int p1);
    void setOnClickListener(int p0,View$OnClickListener p1);
    void setText(int p0,String p1);
    void setVisibility(int p0,int p1);
}
