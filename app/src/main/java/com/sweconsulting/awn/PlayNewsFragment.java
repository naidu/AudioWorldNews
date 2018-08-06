package com.sweconsulting.awn;

import android.support.v4.app.Fragment;
import android.util.Log;
import android.widget.ImageButton;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

import static android.content.ContentValues.TAG;

@EFragment(R.layout.fr_play_news)
public class PlayNewsFragment extends Fragment {

    @ViewById
    ImageButton img_play;

    boolean pause = false;

    @Click(R.id.img_play)
    void flipPlayPauseButton()
    {
        if(pause == false)
        {
            Log.d(TAG, "flipPlayPauseButton: switching to pause");
            img_play.setImageResource(android.R.drawable.ic_media_pause);
            pause = true;
        }
        else
        {
            Log.d(TAG, "flipPlayPauseButton: switching to play");
            img_play.setImageResource(android.R.drawable.ic_media_play);
            pause = false;
        }
    }
}
