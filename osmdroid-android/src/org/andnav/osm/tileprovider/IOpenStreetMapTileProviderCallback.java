package org.andnav.osm.tileprovider;

import java.io.InputStream;

public interface IOpenStreetMapTileProviderCallback {

	/**
	 * The map tile request has completed.
	 * @param pTile the tile request that has completed
	 * @param aTilePath the path of the requested tile, or null if request has completed without returning a tile path
	 */
	void mapTileRequestCompleted(OpenStreetMapTile pTile, String aTilePath);

	/**
	 * The map tile request has completed.
	 * @param pTile the tile request that has completed
	 * @param aTileInputStream the input stream of the requested tile, or null if request has completed without returning a tile
	 */
	void mapTileRequestCompleted(final OpenStreetMapTile aTile, final InputStream aTileInputStream);

	/**
	 * Get the API key for Cloudmade tiles.
	 * See http://developers.cloudmade.com/projects/show/auth
	 * @throws CloudmadeException if the key is not found
	 * @return
	 */
	String getCloudmadeKey() throws CloudmadeException;
}
