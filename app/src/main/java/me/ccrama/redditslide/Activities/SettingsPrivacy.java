package me.ccrama.redditslide.Activities;

import android.os.Bundle;
import android.view.ViewGroup;

import me.ccrama.redditslide.Fragments.SettingsPrivacyFragment;
import me.ccrama.redditslide.R;

public class SettingsPrivacy extends BaseActivityAnim {

    private SettingsPrivacyFragment fragment = new SettingsPrivacyFragment(this);

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        applyColorTheme();
        setContentView(R.layout.activity_settings_privacy);
        setupAppBar(R.id.toolbar, R.string.settings_title_privacy, true, true);

        ((ViewGroup) findViewById(R.id.settings_privacy)).addView(
                getLayoutInflater().inflate(R.layout.activity_settings_privacy_child, null));

        fragment.Bind();
    }

}
