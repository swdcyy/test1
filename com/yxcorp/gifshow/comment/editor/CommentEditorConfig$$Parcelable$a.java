package com.yxcorp.gifshow.comment.editor.CommentEditorConfig$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.comment.editor.CommentEditorConfig$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.comment.editor.CommentEditorConfig;

public class CommentEditorConfig$$Parcelable$a implements Parcelable$Creator	// class@0010bd
{

    public void CommentEditorConfig$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new CommentEditorConfig$$Parcelable(CommentEditorConfig$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       CommentEditorConfig$$Parcelable[] $ParcelableA = new CommentEditorConfig$$Parcelable[p0];
       return $ParcelableA;
    }
}
