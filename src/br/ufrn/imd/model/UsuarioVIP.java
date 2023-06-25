package br.ufrn.imd.model;

import java.io.File;
import java.util.ArrayList;

public class UsuarioVIP extends Usuario {

		
	public UsuarioVIP(String username, String senha) {
		super(username, senha);
		File file = new File("./" + username);
		if(!file.exists()) {
			file.mkdir();
		}
	}
	
	ArrayList<Playlist> listaPlaylists = new ArrayList<>();
	
	
	
	public ArrayList<Playlist> getListaPlaylists() {
		return listaPlaylists;
	}
	
	public void addPlaylist() {
		
	}
	
	public void excludePlaylist() {
		
	}

}
