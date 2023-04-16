package androidx.recyclerview.widget.ViewInfoStore;
import java.lang.Object;
import androidx.collection.SimpleArrayMap;
import androidx.collection.LongSparseArray;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import androidx.recyclerview.widget.RecyclerView$l$c;
import androidx.recyclerview.widget.ViewInfoStore$InfoRecord;
import java.lang.IllegalArgumentException;
import java.lang.String;
import androidx.recyclerview.widget.ViewInfoStore$a;

public class ViewInfoStore	// class@0008dc
{
    public final SimpleArrayMap mLayoutHolderMap;
    public final LongSparseArray mOldChangedHolders;

    public void ViewInfoStore(){
       super();
       this.mLayoutHolderMap = new SimpleArrayMap();
       this.mOldChangedHolders = new LongSparseArray();
    }
    public void addToAppearedInPreLayoutHolders(RecyclerView$ViewHolder p0,RecyclerView$l$c p1){
       ViewInfoStore$InfoRecord infoRecord = this.mLayoutHolderMap.get(p0);
       if (infoRecord == null) {
          infoRecord = ViewInfoStore$InfoRecord.obtain();
          this.mLayoutHolderMap.put(p0, infoRecord);
       }
       infoRecord.flags = infoRecord.flags | 0x02;
       infoRecord.preInfo = p1;
       return;
    }
    public void addToDisappearedInLayout(RecyclerView$ViewHolder p0){
       ViewInfoStore$InfoRecord infoRecord = this.mLayoutHolderMap.get(p0);
       if (infoRecord == null) {
          infoRecord = ViewInfoStore$InfoRecord.obtain();
          this.mLayoutHolderMap.put(p0, infoRecord);
       }
       infoRecord.flags = infoRecord.flags | 0x01;
       return;
    }
    public void addToOldChangeHolders(long p0,RecyclerView$ViewHolder p1){
       this.mOldChangedHolders.put(p0, p1);
    }
    public void addToPostLayout(RecyclerView$ViewHolder p0,RecyclerView$l$c p1){
       ViewInfoStore$InfoRecord infoRecord = this.mLayoutHolderMap.get(p0);
       if (infoRecord == null) {
          infoRecord = ViewInfoStore$InfoRecord.obtain();
          this.mLayoutHolderMap.put(p0, infoRecord);
       }
       infoRecord.postInfo = p1;
       infoRecord.flags = infoRecord.flags | 0x08;
       return;
    }
    public void addToPreLayout(RecyclerView$ViewHolder p0,RecyclerView$l$c p1){
       ViewInfoStore$InfoRecord infoRecord = this.mLayoutHolderMap.get(p0);
       if (infoRecord == null) {
          infoRecord = ViewInfoStore$InfoRecord.obtain();
          this.mLayoutHolderMap.put(p0, infoRecord);
       }
       infoRecord.preInfo = p1;
       infoRecord.flags = infoRecord.flags | 0x04;
       return;
    }
    public void clear(){
       this.mLayoutHolderMap.clear();
       this.mOldChangedHolders.clear();
    }
    public RecyclerView$ViewHolder getFromOldChangeHolders(long p0){
       return this.mOldChangedHolders.get(p0);
    }
    public boolean isDisappearing(RecyclerView$ViewHolder p0){
       ViewInfoStore$InfoRecord infoRecord = this.mLayoutHolderMap.get(p0);
       int i = 1;
       if (infoRecord == null || !(infoRecord.flags & i)) {
          i = false;
       }
       return i;
    }
    public boolean isInPreLayout(RecyclerView$ViewHolder p0){
       ViewInfoStore$InfoRecord infoRecord = this.mLayoutHolderMap.get(p0);
       boolean b = (infoRecord != null && (infoRecord.flags & 0x04))? true: false;
       return b;
    }
    public void onDetach(){
       ViewInfoStore$InfoRecord.drainCache();
    }
    public void onViewDetached(RecyclerView$ViewHolder p0){
       this.removeFromDisappearedInLayout(p0);
    }
    public final RecyclerView$l$c popFromLayoutStep(RecyclerView$ViewHolder p0,int p1){
       ViewInfoStore$InfoRecord preInfo;
       int i = this.mLayoutHolderMap.indexOfKey(p0);
       RecyclerView$l$c ol$c = null;
       if (i < 0) {
          return ol$c;
       }
       ViewInfoStore$InfoRecord infoRecord = this.mLayoutHolderMap.valueAt(i);
       if (infoRecord != null) {
          ViewInfoStore$InfoRecord flags = infoRecord.flags;
          if (flags & p1) {
             int i1 = (~ p1) & flags;
             infoRecord.flags = i1;
             if (p1 == 4) {
                preInfo = infoRecord.preInfo;
             }else if(p1 == 8){
                preInfo = infoRecord.postInfo;
             }else {
                throw new IllegalArgumentException("Must provide flag PRE or POST");
             }
             if (!(i1 & 0x0c)) {
                this.mLayoutHolderMap.removeAt(i);
                ViewInfoStore$InfoRecord.recycle(infoRecord);
             }
             return preInfo;
          }
       }
       return ol$c;
    }
    public RecyclerView$l$c popFromPostLayout(RecyclerView$ViewHolder p0){
       return this.popFromLayoutStep(p0, 8);
    }
    public RecyclerView$l$c popFromPreLayout(RecyclerView$ViewHolder p0){
       return this.popFromLayoutStep(p0, 4);
    }
    public void process(ViewInfoStore$a p0){
       for (int i = this.mLayoutHolderMap.size() - 1; i >= 0; i = i - 1) {
          RecyclerView$ViewHolder viewHolder = this.mLayoutHolderMap.keyAt(i);
          ViewInfoStore$InfoRecord infoRecord = this.mLayoutHolderMap.removeAt(i);
          ViewInfoStore$InfoRecord flags = infoRecord.flags;
          int i1 = flags & 0x03;
          if (i1 == 3) {
             p0.b(viewHolder);
          }else {
             i1 = flags & 0x01;
             if (i1) {
                flags = infoRecord.preInfo;
                if (flags == null) {
                   p0.b(viewHolder);
                }else {
                   p0.c(viewHolder, flags, infoRecord.postInfo);
                }
             }else {
                i1 = flags & 0x0e;
                if (i1 == 14) {
                   p0.a(viewHolder, infoRecord.preInfo, infoRecord.postInfo);
                }else {
                   i1 = flags & 0x0c;
                   if (i1 == 12) {
                      p0.d(viewHolder, infoRecord.preInfo, infoRecord.postInfo);
                   }else {
                      i1 = flags & 0x04;
                      if (i1) {
                         p0.c(viewHolder, infoRecord.preInfo, null);
                      }else {
                         int i2 = flags & 0x08;
                         if (i2) {
                            p0.a(viewHolder, infoRecord.preInfo, infoRecord.postInfo);
                         }
                      }
                   }
                }
             }
          }
          ViewInfoStore$InfoRecord.recycle(infoRecord);
       }
       return;
    }
    public void removeFromDisappearedInLayout(RecyclerView$ViewHolder p0){
       ViewInfoStore$InfoRecord infoRecord = this.mLayoutHolderMap.get(p0);
       if (infoRecord == null) {
          return;
       }
       infoRecord.flags = infoRecord.flags & 0xfe;
       return;
    }
    public void removeViewHolder(RecyclerView$ViewHolder p0){
       int i = this.mOldChangedHolders.size() - 1;
       while (i >= 0) {
          if (p0 == this.mOldChangedHolders.valueAt(i)) {
             this.mOldChangedHolders.removeAt(i);
             break ;
          }else {
             i = i - 1;
          }
       }
       ViewInfoStore$InfoRecord infoRecord = this.mLayoutHolderMap.remove(p0);
       if (infoRecord != null) {
          ViewInfoStore$InfoRecord.recycle(infoRecord);
       }
       return;
    }
}
