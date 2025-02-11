{ 
  pkgs ? import <nixpkgs> {}
}:

pkgs.mkShell {
		buildInputs = with pkgs; [
			jdk
			mvnd
			fish
		];
		JAVA_HOME = "${pkgs.jdk}";
		shell = "${pkgs.fish}";
}
