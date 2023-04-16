package androidx.appcompat.widget.MenuPopupWindow$MenuDropDownListView;
import androidx.appcompat.widget.DropDownListView;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Configuration;
import android.view.MotionEvent;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.HeaderViewListAdapter;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.e;
import android.view.MenuItem;
import w0.o;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.view.menu.ListMenuItemView;
import android.widget.LinearLayout;
import android.graphics.drawable.Drawable;

public class MenuPopupWindow$MenuDropDownListView extends DropDownListView	// class@00060d
{
    public final int p;
    public final int q;
    public o r;
    public MenuItem s;

    public void MenuPopupWindow$MenuDropDownListView(Context p0,boolean p1){
       super(p0, p1);
       if (1 == p0.getResources().getConfiguration().getLayoutDirection()) {
          this.p = 21;
          this.q = 22;
       }else {
          this.p = 22;
          this.q = 21;
       }
       return;
    }
    public boolean onHoverEvent(MotionEvent p0){
       int headersCount;
       if (this.r != null) {
          ListAdapter adapter = this.getAdapter();
          if (adapter instanceof HeaderViewListAdapter) {
             headersCount = adapter.getHeadersCount();
             adapter = adapter.getWrappedAdapter();
          }else {
             headersCount = 0;
          }
          h oh = null;
          if (p0.getAction() != 0.00f) {
             int i = this.pointToPosition((int)p0.getX(), (int)p0.getY());
             if (i != -1) {
                i = i - headersCount;
                if (i >= 0 && i < adapter.getCount()) {
                   oh = adapter.c(i);
                }
             }
          }
          MenuPopupWindow$MenuDropDownListView ts = this.s;
          if (ts != oh) {
             e uoe = adapter.b();
             if (ts != null) {
                this.r.b(uoe, ts);
             }
             this.s = oh;
             if (oh != null) {
                this.r.a(uoe, oh);
             }
          }
       }
    label_005b :
       return super.onHoverEvent(p0);
    }
    public boolean onKeyDown(int p0,KeyEvent p1){
       ListMenuItemView selectedView = this.getSelectedView();
       if (selectedView != null && p0 == this.p) {
          if (selectedView.isEnabled() && selectedView.getItemData().hasSubMenu()) {
             this.performItemClick(selectedView, this.getSelectedItemPosition(), this.getSelectedItemId());
          }
          return true;
       }else if(selectedView != null && p0 == this.q){
          this.setSelection(-1);
          this.getAdapter().b().e(false);
          return true;
       }else {
          return super.onKeyDown(p0, p1);
       }
    }
    public void setHoverListener(o p0){
       this.r = p0;
    }
    public void setSelector(Drawable p0){
       super.setSelector(p0);
    }
}
