package com.mstr.letschat.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.mstr.letschat.service.MessageService;

public class BootReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())) {
			context.startService(new Intent(MessageService.ACTION_CONNECT, null, context, MessageService.class));
		}
	}
}