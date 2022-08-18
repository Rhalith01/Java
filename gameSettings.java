import java.util.Scanner;

public class gameSettings {

	public static void main(String[] args) {

		int select, selectMusic, selectEffect, selectAmbient, selectGraphics, selectResolution, selectDetail = 0,
				musicSound = 100, effectSound = 100, ambientSound = 100, selectShadow, selectVsync, selectAnimations,
				selectInGame, selectSubtitle, selectFog, selectDistance, selectAngle, selectClient, selectInterface,
				selectFontSize;
		String shadowQuality = null, detailSetting = null, vsync = null, interfaceSize = null, fontSize = null,
				fog = null, animations = null, subtitle = null, distance = null, angle = null, resolutionSetting = null;
		try (Scanner input = new Scanner(System.in)) {
			for (int i = 0; i >= i; i++) {
				System.out.println("******  Game Settings  ******");
				System.out.println();
				System.out.println("1-) Sound Settings");
				System.out.println("2-) Graphics Settings");
				System.out.println("3-) Client Settings");
				System.out.println("4-) In Game Settings");
				select = input.nextInt();

				switch (select) {
				case 1:
					System.out.println("******  Sound Settings  ******");
					System.out.println();
					System.out.println("Music Sound = " + musicSound);
					System.out.println("Effect Sound" + effectSound);
					System.out.println("Ambient Sound" + ambientSound);
					System.out.println();
					System.out.println("Music Sound");
					System.out.println("1-) %75");
					System.out.println("2-) %50");
					System.out.println("3-) %25");
					System.out.println("4-) Mute music sound");
					selectMusic = input.nextInt();

					if (selectMusic == 1) {
						System.out.println("Music Volume adjusted to 75%");
						musicSound = musicSound - 75;
						System.out.println("New Music Sound: " + musicSound);
					} else if (selectMusic == 2) {
						System.out.println("Music Volume adjusted to 50%");
						musicSound = musicSound - 50;
						System.out.println("New Music Sound: " + musicSound);
					} else if (selectMusic == 3) {
						System.out.println("Music Volume adjusted to 25%");
						musicSound = musicSound - 25;
						System.out.println("New Music Sound: " + musicSound);
					} else if (selectMusic == 4) {
						System.out.println("Music sound muted");
						musicSound = 0;
						System.out.println("New Music Sound: " + musicSound);
					}
					System.out.println("Effect Sound");
					System.out.println("1-) %75");
					System.out.println("2-) %50");
					System.out.println("3-) %25");
					System.out.println("4-) Mute effect sound");
					selectEffect = input.nextInt();

					if (selectEffect == 1) {
						System.out.println("Effect Volume adjusted to 75%");
						effectSound = effectSound - 75;
						System.out.println("New Effect Sound: " + effectSound);
					} else if (selectEffect == 2) {
						System.out.println("Effect Volume adjusted to 50%");
						effectSound = effectSound - 50;
						System.out.println("New Effect Sound: " + effectSound);
					} else if (selectEffect == 3) {
						System.out.println("Effect Volume adjusted to 25%");
						effectSound = effectSound - 25;
						System.out.println("New Effect Sound: " + effectSound);
					} else if (selectEffect == 4) {
						System.out.println("Effect sound muted");
						effectSound = 0;
						System.out.println("New Effect Sound: " + effectSound);
					}

					System.out.println("Ambient Sound");
					System.out.println("1-) %75");
					System.out.println("2-) %50");
					System.out.println("3-) %25");
					System.out.println("4-) Mute ambient sound");
					selectAmbient = input.nextInt();

					if (selectAmbient == 1) {
						System.out.println("Ambient Volume adjusted to 75%");
						ambientSound = ambientSound - 75;
						System.out.println("New Ambient Volume: " + ambientSound);
					} else if (selectAmbient == 2) {
						System.out.println("Ambient Volume adjusted to 50%");
						ambientSound = ambientSound - 50;
						System.out.println("New Ambient Volume: " + ambientSound);
					} else if (selectAmbient == 3) {
						System.out.println("Ambient Volume adjusted to 25%");
						ambientSound = ambientSound - 25;
						System.out.println("New Ambient Volume: " + ambientSound);
					} else if (selectAmbient == 4) {
						System.out.println("Ambient sound muted");
						ambientSound = 0;
						System.out.println("New Ambient Sound: " + ambientSound);
					}
					break;
				case 2:
					System.out.println("******  Graphic Settings  ******");
					System.out.println("1-) Resolution Settings");
					System.out.println("2-) Detail Settings");
					System.out.println("3-) Shadow Quality");
					System.out.println("4-) VSync");
					selectGraphics = input.nextInt();

					if (selectGraphics == 1) {

						System.out.println("Resolution Settings");

						System.out.println("1-) 1366x768");
						System.out.println("2-) 1280x768");
						System.out.println("3-) 1280x720");
						System.out.println("4-) 1024x768");
						System.out.println("5-) 800x600");
						selectResolution = input.nextInt();

						if (selectResolution == 1) {
							System.out.println("Your new resolution value is 1366x768");
							resolutionSetting = "1366x768";
							System.out.println("New Resolution Setting: " + resolutionSetting);
						} else if (selectResolution == 2) {
							System.out.println("Your new resolution value is 1280x768");
							resolutionSetting = "1280x768";
							System.out.println("New Resolution Setting: " + resolutionSetting);
						} else if (selectResolution == 3) {
							System.out.println("Your new resolution value is 1280x720");
							resolutionSetting = "1280x720";
							System.out.println("New Resolution Setting: " + resolutionSetting);
						} else if (selectResolution == 4) {
							System.out.println("Your new resolution value is 1024x768");
							resolutionSetting = "1024x768";
							System.out.println("New Resolution Setting: " + resolutionSetting);
						} else if (selectResolution == 5) {
							System.out.println("Your new resolution value is 800x600");
							resolutionSetting = "800x600";
							System.out.println("New Resolution Setting: " + resolutionSetting);
						}

						if (selectGraphics == 2) {

							System.out.println("Detail Settings");

							System.out.println("1-) ULTRA");
							System.out.println("2-) HIGH");
							System.out.println("3-) MEDIUM");
							System.out.println("4-) LOW");
							System.out.println("5-) VERY LOW");
							selectDetail = input.nextInt();
						}

						if (selectDetail == 1) {
							System.out.println("Your detail settings have been updated to ultra");
							detailSetting = "ultra";
							System.out.println("New Detail Settings: " + detailSetting);
						} else if (selectDetail == 2) {
							System.out.println("Your detail settings have been updated to high");
							detailSetting = "high";
							System.out.println("New Detail Settings: " + detailSetting);
						} else if (selectDetail == 3) {
							System.out.println("New Your detail settings have been updated to medium");
							detailSetting = "medium";
							System.out.println("New Detail Settings: " + detailSetting);
						} else if (selectDetail == 4) {
							System.out.println("Your detail settings have been updated to low");
							detailSetting = "low";
							System.out.println("New Detail Settings: " + detailSetting);
						} else if (selectDetail == 5) {
							System.out.println("Your detail settings have been updated to verylow");
							detailSetting = "verylow";
							System.out.println("New Detail Settings: " + detailSetting);
						}

						if (selectGraphics == 3) {
							System.out.println("Shadow Quality");

							System.out.println("1-) ULTRA");
							System.out.println("2-) HIGH");
							System.out.println("3-) MEDIUM");
							System.out.println("4-) LOW");
							System.out.println("5-) VERYLOW");
							selectShadow = input.nextInt();

							if (selectShadow == 1) {
								System.out.println("Your shadow quality have been updated to ultra");
								shadowQuality = "ultra";
								System.out.println("New Shadow Quality: " + shadowQuality);
							} else if (selectShadow == 2) {
								System.out.println("Your shadow quality have been updated to high");
								shadowQuality = "high";
								System.out.println("New Shadow Qualitt: " + shadowQuality);
							} else if (selectShadow == 3) {
								System.out.println("Your shadow quality have been updated to medium");
								shadowQuality = "medium";
								System.out.println("New Shadow Quality: " + shadowQuality);
							} else if (selectShadow == 4) {
								System.out.println("Your shadow quality have been updated to low");
								shadowQuality = "low";
								System.out.println("New Shadow Quality: " + shadowQuality);
							} else if (selectShadow == 5) {
								System.out.println("Your shadow quality have been updated to verylow");
								shadowQuality = "verylow";
								System.out.println("New Shadow Quality: " + shadowQuality);
							}

							if (selectGraphics == 4) {
								System.out.println("VSync");
								System.out.println();
								System.out.println("1-) ON");
								System.out.println("2-) OFF");
								selectVsync = input.nextInt();

								if (selectVsync == 1) {
									System.out.println("VSync is turned on");
									vsync = "on";
									System.out.println("Vsync status: " + vsync);
								} else if (selectVsync == 2) {
									System.out.println("VSync is turned off");
									vsync = "off";
									System.out.println("Vsync status: " + vsync);
								}
							}
						}

					}

				case 3:
					System.out.println("******  Client Settings  ******");
					System.out.println();
					System.out.println("1-) Interface Size");
					System.out.println("2-) Font Size");
					System.out.println("3-) Animations");
					selectClient = input.nextInt();

					if (selectClient == 1) {
						System.out.println("Interface Size");

						System.out.println("1-) Large");
						System.out.println("2-) Medium");
						System.out.println("3-) Small");
						selectInterface = input.nextInt();

						if (selectInterface == 1) {
							System.out.println("Interface size set to large");
							interfaceSize = "large";
							System.out.println("New Interface Size: " + interfaceSize);
						} else if (selectInterface == 2) {
							System.out.println("Interface size set to Medium");
							interfaceSize = "medium";
							System.out.println("New Interface Size: " + interfaceSize);
						} else if (selectInterface == 3) {
							System.out.println("Interface size set to small");
							interfaceSize = "small";
							System.out.println("New Interface Size: " + interfaceSize);
						}

						if (selectClient == 2) {
							System.out.println("Font Size");

							System.out.println("1-) Large");
							System.out.println("2-) Medium");
							System.out.println("3-) Small");
							selectFontSize = input.nextInt();

							if (selectFontSize == 1) {
								System.out.println("Font size set to large");
								fontSize = "large";
								System.out.println("New Font Size: " + fontSize);
							} else if (selectFontSize == 2) {
								System.out.println("Font size set to medium");
								fontSize = "medium";
								System.out.println("New Font Size: " + fontSize);
							} else if (selectFontSize == 3) {
								System.out.println("Font size set to small");
								fontSize = "small";
								System.out.println("New Font Size: " + fontSize);
							}

							if (selectClient == 3) {
								System.out.println("Animations");

								System.out.println("1-) Default");
								System.out.println("2-) Little");
								System.out.println("3-) With Interaction");
								selectAnimations = input.nextInt();

								if (selectAnimations == 1) {
									System.out.println("Animations set by default");
									animations = "default";
									System.out.println("New Animations Setting: " + animations);
								} else if (selectAnimations == 2) {
									System.out.println("Animations set by little");
									animations = "little";
									System.out.println("New Animations Setting: " + animations);
								} else if (selectAnimations == 3) {
									System.out.println("New Animations Setting: " + animations);
								}
							}

						}
					}
				case 4:
					System.out.println("******  In Game Settings  ******");
					System.out.println();
					System.out.println("1-) Subtitles");
					System.out.println("2-) Fog Density");
					System.out.println("3-) Camera Distance");
					System.out.println("4-) Camera angle");
					selectInGame = input.nextInt();

					if (selectInGame == 1) {
						System.out.println("Subtitles");

						System.out.println("1-) ON");
						System.out.println("2-) OFF");
						selectSubtitle = input.nextInt();

						if (selectSubtitle == 1) {
							System.out.println("Subtitles turned on");
							subtitle = "on";
							System.out.println("New Subtitles status: " + subtitle);
						} else if (selectSubtitle == 2) {
							System.out.println("Subtitles turned off");
							subtitle = "off";
							System.out.println("New Subtitles status: " + subtitle);
						}

						if (selectInGame == 2) {
							System.out.println("Fog Density");

							System.out.println("1-) Default");
							System.out.println("2-) Little");
							System.out.println("3-) Small");
							selectFog = input.nextInt();

							if (selectFog == 1) {
								System.out.println("Fog Density turned default");
								fog = "default";
								System.out.println("New Fog Density status: " + fog);
							} else if (selectFog == 2) {
								System.out.println("Fog Density turned little");
								fog = "little";
								System.out.println("New Fog Density status: " + fog);
							} else if (selectFog == 3) {
								System.out.println("Fog Density turned small");
								fog = "small";
								System.out.println("New Fog Density status: " + fog);
							}
							if (selectInGame == 3) {
								System.out.println("Camera Distance");

								System.out.println("1-) Long");
								System.out.println("2-) Medium");
								System.out.println("3-) Short");
								selectDistance = input.nextInt();

								if (selectDistance == 1) {
									System.out.println("Camera Distance turned long");
									distance = "long";
									System.out.println("New Camera Distance: " + distance);
								} else if (selectDistance == 2) {
									System.out.println("Camera Distance turned medium");
									distance = "medium";
									System.out.println("New Camera Distance: " + distance);
								} else if (selectDistance == 3) {
									System.out.println("Camera Distance turned short");
									distance = "short";
									System.out.println("New Camera Distance: " + distance);
								}

								if (selectInGame == 4) {
									System.out.println("Camera Angle");

									System.out.println("1-) Perspektive");
									System.out.println("2-) Default");
									System.out.println("3-) 3D");
									System.out.println("4-) FPS");
									selectAngle = input.nextInt();

									if (selectAngle == 1) {
										System.out.println("Camera Angle turned perspektive");
										angle = "perspektive";
										System.out.println("New Camera Angle: " + angle);
									} else if (selectAngle == 2) {
										System.out.println("Camera Angle turned default");
										angle = "default";
										System.out.println("New Camera Angle: " + angle);
									} else if (selectAngle == 3) {
										System.out.println("Camera Angle turned 3d");
										angle = "3d";
										System.out.println("New Camera Angle: " + angle);
									} else if (selectAngle == 4) {
										System.out.println("Camera Angle turned fps");
										angle = "fps";
										System.out.println("New Camera Angle: " + angle);
									}
								}
							}
						}

					}

				}
			}
		}
	}
}