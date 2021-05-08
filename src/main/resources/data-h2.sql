DROP TABLE IF EXISTS BEERS;
  
CREATE TABLE BEERS (
  id LONG AUTO_INCREMENT  PRIMARY KEY,
  beer_name VARCHAR(60) NOT NULL
);

INSERT INTO BEERS (beer_name) VALUES
  ('Deschutes The Abyss'),
  ('Mikkeller Beer Geek Breakfast'),
  ('Tempest Mexicake'),
  ('Sori Anniversary Barley Wine'),
  ('Toppling Goliath Pompeii IPA'),
  ('Nickel Brook Kentucky Bastard'),
  ('Green Flash Palate Wrecker'),
  ('Aecht Schlenkerla Rauchbier Urbock'),
  ('Central City Red Racer IPA'),
  ('Howe Sound Woolly Bugger');


--longest beer name in world
--Flower Power Hippy Dippy All Things Pretty American Amber