package arkadii.ivanov.alertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button but = (Button) findViewById(R.id.button);
		but.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Context context;
				AlertDialog.Builder ad = new AlertDialog.Builder(MainActivity.this);
				ad.setMessage("Вы хотите выйти из приложения"); //Создадим текст сообщения
				ad.setCancelable(false); //Запритить ннопки назад
				ad.setPositiveButton("Да", new DialogInterface.OnClickListener() { //кнопка с положительным действием
					@Override
					public void onClick(DialogInterface dialog, int which) {
						MainActivity.this.finish();

					}
				});

				ad.setNegativeButton("Нет", new DialogInterface.OnClickListener() { //кнопка с отрицательным действием
					@Override
					public void onClick(DialogInterface dialog, int which) {
						dialog.cancel();

					}
				});

				AlertDialog ad1 = ad.create();
				ad1.show();
			}
		});
	}
}