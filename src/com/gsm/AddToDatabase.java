package com.gsm;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class AddToDatabase extends SQLiteOpenHelper {

	public AddToDatabase(Context context, String name, CursorFactory factory,
			int version) {
		super(context, name, factory, version);
	}//
	public class AddToDatabase extends SQLiteOpenHelper {

		public AddToDatabase(Context context, String name, CursorFactory factory,
				int version) {
			super(context, name, factory, version);
		}//Veritaban�na class eklendi..

	@Override
	public void onCreate(SQLiteDatabase db) {

		String strSQL = "CREATE TABLE gsm_information (id "
				+ "INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, signal_strength INTEGER NOT NULL"
				+ ", signal_strength_dbm INTEGER NOT NULL, noise INTEGER NOT NULL, "
				+ "latitude INTEGER, langitude INTEGER, model TEXT NOT NULL, "
				+ "battery INTEGER NOT NULL, process_date TEXT NOT NULL)";

		db.execSQL(strSQL);

	}//
	public void onCreate(SQLiteDatabase db) {

		String strSQL = "CREATE TABLE gsm_information (id "
				+ "INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, signal_strength INTEGER NOT NULL"
				+ ", signal_strength_dbm INTEGER NOT NULL, noise INTEGER NOT NULL, "
				+ "latitude INTEGER, langitude INTEGER, model TEXT NOT NULL, "
				+ "battery INTEGER NOT NULL, process_date TEXT NOT NULL)";//
		String strSQL = "CREATE TABLE gsm_information (id "
				+ "INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, signal_strength INTEGER NOT NULL"
				+ ", signal_strength_dbm INTEGER NOT NULL, noise INTEGER NOT NULL, "
				+ "latitude INTEGER, langitude INTEGER, model TEXT NOT NULL, "
				+ "battery INTEGER NOT NULL, process_date TEXT NOT NULL)";
		//veri tabani degistirildi

		db.execSQL(strSQL);

	}//oncreate metodu tanimlandi

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

	}

}
