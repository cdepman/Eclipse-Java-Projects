package com.cdepman.videoplayer;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.ErrorReason;
import com.google.android.youtube.player.YouTubePlayer.PlaybackEventListener;
import com.google.android.youtube.player.YouTubePlayer.PlayerStateChangeListener;
import com.google.android.youtube.player.YouTubePlayer.Provider;
import com.google.android.youtube.player.YouTubePlayerView;

public class StandAloneActivity extends Activity implements View.OnClickListener{
	public static final String GOOGLE_API_KEY = "AIzaSyDWuFiL4B2v8xD2LQGIAEvZyqC9_L5F830";
	
	public static final String YOUTUBE_VIDEO_ID = "12CeaxLiMgE";
	
	public static final String PLAYLIST_ID = "";
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.player);
		YouTubePlayerView youTubePlayView = (YouTubePlayerView) findViewById(R.id.player);
		youTubePlayView.initialize(GOOGLE_API_KEY, this);
	}
	
	public void onInitializationFailure(Provider provider, YouTubeInitializationResult result){
		Toast.makeText(this, "Cannot Initialize YouTube Player", Toast.LENGTH_LONG).show();
	}
	
	public void onInitializationSuccess(Provider provider, YouTubePlayer player, boolean wasRestored){
		player.setPlayerStateChangeListener(playerStateChangeListener);
		player.setPlaybackEventListener(playBackEventListener);
		
		if (!wasRestored){
			player.cueVideo(YOUTUBE_VIDEO_ID);
		}
	}
	
	private PlaybackEventListener playBackEventListener = new PlaybackEventListener(){
		
		public void onBuffering(boolean arg0){
			
		}
		
		public void onPaused(){
			
		}
		
		public void onPlaying(){
			
		}
		public void onSeekTo(int arg0){
			
		}
		public void onStopped(){
			
		}
	};
	
	private PlayerStateChangeListener playerStateChangeListener = new PlayerStateChangeListener(){
		public void onAdStarted(){
			
		}
		public void onError(ErrorReason arg0){
			
		}
		public void onLoaded(String arg0){
			
		}
		public void onLoading(){
			
		}
		
		public void onVideoStarted(){
			
		}
		public void onVideoEnded(){
			
		}
	};
	
	
	
}
