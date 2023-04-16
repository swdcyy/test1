package androidx.emoji.text.MetadataRepo$Node;
import java.lang.Object;
import android.util.SparseArray;
import androidx.emoji.text.EmojiMetadata;

public class MetadataRepo$Node	// class@000764
{
    public final SparseArray mChildren;
    public EmojiMetadata mData;

    public void MetadataRepo$Node(){
       super(1);
    }
    public void MetadataRepo$Node(int p0){
       super();
       this.mChildren = new SparseArray(p0);
    }
    public MetadataRepo$Node get(int p0){
       MetadataRepo$Node tmChildren = this.mChildren;
       MetadataRepo$Node node = (tmChildren == null)? null: tmChildren.get(p0);
       return node;
    }
    public final EmojiMetadata getData(){
       return this.mData;
    }
    public void put(EmojiMetadata p0,int p1,int p2){
       MetadataRepo$Node node = this.get(p0.getCodepointAt(p1));
       if (node == null) {
          node = new MetadataRepo$Node();
          this.mChildren.put(p0.getCodepointAt(p1), node);
       }
       if (p2 > p1) {
          p1++;
          node.put(p0, p1, p2);
       }else {
          node.mData = p0;
       }
       return;
    }
}
